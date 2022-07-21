/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import view.MyTextEditor;

/**
 *
 * @author duchi
 */
public class HandlerEdit {

    public void FindText(String find, JTextArea data, boolean isUp) {
        boolean isFail = true;
        if (data.getSelectedText() == null) {
            int start = 0;
            int end = start + find.length();
            while (end <= data.getText().length() && start >= 0) {

                String temp = data.getText().substring(start, end);
                System.out.println(temp);
                if (temp.equals(find)) {
                    data.setSelectionStart(start);
                    data.setSelectionEnd(end);
                    isFail = false;
                    break;
                }
                start = isUp ? start + 1 : start - 1;
                end = isUp ? end + 1 : end - 1;
            }

        } else {
            int start =isUp ? data.getSelectionStart() + 1:data.getSelectionStart() - 1;
            int end = start + find.length();
            if (end >= data.getText().length()) {
                start = 0;
                end = start + find.length();
                while (end <= data.getText().length() && start >= 0) {

                    String temp = data.getText().substring(start, end);
                    System.out.println(temp);
                    if (temp.equals(find)) {
                        data.setSelectionStart(start);
                        data.setSelectionEnd(end);
                        isFail = false;
                        break;
                    }
                    start = isUp ? start + 1 : start - 1;
                    end = isUp ? end + 1 : end - 1;
                    System.out.println(start + " 0 " + end);
                }
            }
            if (start<0) {
                
                end = data.getText().length();
                start = end-find.length();
                while (end <= data.getText().length() && start >= 0) {

                    String temp = data.getText().substring(start, end);
                    System.out.println(temp);
                    if (temp.equals(find)) {
                        data.setSelectionStart(start);
                        data.setSelectionEnd(end);
                        isFail = false;
                        break;
                    }
                    start = isUp ? start + 1 : start - 1;
                    end = isUp ? end + 1 : end - 1;
                    System.out.println(start + " 0 " + end);
                }
            }
            else {
                while (end <= data.getText().length() && start >= 0) {

                    String temp = data.getText().substring(start, end);

                    System.out.println(temp);
                    if (temp.equals(find)) {
                        data.setSelectionStart(start);
                        data.setSelectionEnd(end);
                        isFail = false;
                        break;
                    }
                    start = isUp ? start + 1 : start - 1;
                    end = isUp ? end + 1 : end - 1;
                    System.out.println(start + " 1 " + end);
                }
                if (isFail) {
                    start = 0;
                    end = start + find.length();
                    while (end <= data.getText().length() && start >= 0) {

                        String temp = data.getText().substring(start, end);
                        System.out.println(temp);
                        if (temp.equals(find)) {
                            data.setSelectionStart(start);
                            data.setSelectionEnd(end);
                            isFail = false;
                            break;
                        }
                        start = isUp ? start + 1 : start - 1;
                        end = isUp ? end + 1 : end - 1;
                        System.out.println(start + " 2 " + end);
                    }
                }
            }
        }
        if (isFail) {
            JOptionPane.showMessageDialog(null, "Not found!");
        }
    }

    private String formatFindString(String find) {
        Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
        StringBuffer findFormat = new StringBuffer();
        for (int i = 0; i < find.length(); i++) {
            String charac = find.substring(i, i + 1);
            if (regex.matcher(charac).find()) {
                findFormat.append("\\" + charac);
            } else {
                findFormat.append(charac);
            }
        }
        return findFormat.toString();
    }

    public void ReplaceAll(String find, String replace, JTextArea data) {

        data.setText(data.getText().replaceAll(formatFindString(find), replace));

    }

    public void ReplaceText(String find, String replace, JTextArea data) {
        if (data.getSelectedText() == null) {
            FindText(find, data, true);
            return;
        }
        if (!data.getSelectedText().equals(find)) {
            FindText(find, data, true);
            return;
        }
        int start = data.getSelectionStart();
        int end = data.getSelectionEnd();
        StringBuilder strBuilder = new StringBuilder(data.getText());
        strBuilder.replace(start, end, replace);
        data.setText(strBuilder.toString());

    }

}
