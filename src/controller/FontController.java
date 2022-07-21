/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import view.FontChange;
import view.MyTextEditor;
import view.Replace;

/**
 *
 * @author duchi
 */
public class FontController {

    private FontChange fontChange;
    private MyTextEditor editor;
    private HashMap<String, Integer> indexControllFamily = new HashMap<>();//Family - Index
    private HashMap<String, Integer> controllStyle = new HashMap<>();// Style - Int in font sytle
    private HashMap<Integer, Integer> indexControllSize = new HashMap<>();// Size - Index
    private Font cuFont;

    public FontController(MyTextEditor editor) {
        this.cuFont = editor.getjTextAreaNote().getFont();
        this.editor = editor;
        this.fontChange = new FontChange(editor, false);
        //System.out.println(cuFont.getSize()+"");
        fontChange.getjFontSizeInput().setText(cuFont.getSize()+"");
        
        
        fontChange.setVisible(true);
        LoadListSize();
        LoadListFamilyFont();
        LoadListSytle();

        fontChange.getjListFamily().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }

        });
        fontChange.getjListStyle().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        fontChange.getjListSize().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });

        fontChange.getjButtonOk().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }

        });
        fontChange.getjFontFamilyInput().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFontFamilyInputActionPerformed(evt);
            }

        });

        fontChange.getjFontStyleInput().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFontStyleInputActionPerformed(evt);
            }

        });

        fontChange.getjFontSizeInput().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFontSizeInputActionPerformed(evt);
            }

        });

    }

    private void jButtonOkActionPerformed(ActionEvent evt) {
        
        editor.getjTextAreaNote().setFont(cuFont);
    }

    private void jListValueChanged(ListSelectionEvent evt) {
      try{
       Font font = new Font(fontChange.getjListFamily().getSelectedValuesList().get(0), fontChange.getjListStyle().getSelectedIndex(), (int)fontChange.getjListSize().getSelectedValuesList().get(0));
            this.cuFont = font;
        fontChange.getjFontStyleInput().setText(fontNames[cuFont.getStyle()]);
        fontChange.getjFontFamilyInput().setText(cuFont.getFamily());
        fontChange.getjFontSizeInput().setText(cuFont.getSize()+ "");
      
        fontChange.getLbPreview().setFont(cuFont);
      } catch(Exception e){ 
          LoadListSize();
      }
    }
    String fontNames[] = {"Normal", "Bold", "Italic", "Bold Italic"};

    private void LoadListSytle() {

        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < fontNames.length; i++) {
            model.addElement(fontNames[i]);

            controllStyle.put(fontNames[i], i);
        }
        fontChange.getjListStyle().setModel(model);
        fontChange.getjListStyle().setSelectedIndex(cuFont.getStyle());
        fontChange.getjFontStyleInput().setText(fontNames[cuFont.getStyle()] + "");
    }

    private void LoadListSize() {
        DefaultListModel model = new DefaultListModel();
        //indexControllSize.clear();
        int index = 0;
        boolean isInsert = false;
        for (int i = 8; i < 49; i += 2) {

            try {
                int userInput = Integer.parseInt(fontChange.getjFontSizeInput().getText());
                if (i > userInput && userInput % 2 != 0 && !isInsert) {
                    model.addElement(Integer.parseInt(fontChange.getjFontSizeInput().getText()));

                    indexControllSize.put(userInput, index);
                    index++;
                    isInsert = true;
                }
            } catch (NumberFormatException exception) {

            }

            model.addElement(i);
            indexControllSize.put(i, index);
            index++;
        }
        System.out.println(cuFont.getSize());
        fontChange.getjListSize().setModel(model);
        System.out.println(indexControllSize.get(cuFont.getSize()));
        fontChange.getjListSize().setSelectedIndex(indexControllSize.get(cuFont.getSize()));
        fontChange.getjFontSizeInput().setText(cuFont.getSize() + "");
    }

    private void LoadListFamilyFont() {
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < fontNames.length; i++) {
            model.addElement(fontNames[i]);
            indexControllFamily.put(fontNames[i].trim(), i);
        }
        fontChange.getjListFamily().setModel(model);
        fontChange.getjListFamily().setSelectedIndex(indexControllFamily.get(cuFont.getFamily()));
        fontChange.getjFontFamilyInput().setText(cuFont.getFamily());

    }

    private void jFontFamilyInputActionPerformed(ActionEvent evt) {
        if (indexControllFamily.get(fontChange.getjFontFamilyInput().getText()) != null) {
            Font font = new Font(fontChange.getjFontFamilyInput().getText(), cuFont.getStyle(), cuFont.getSize());
            this.cuFont = font;
            LoadListFamilyFont();
        } else {
            System.err.println();
            JOptionPane.showMessageDialog(null, "Please enter Font Family within the allowed range!");
        }
    }

    private void jFontStyleInputActionPerformed(ActionEvent evt) {
        if (controllStyle.get(fontChange.getjFontStyleInput().getText()) != null) {
            cuFont = new Font(cuFont.getFamily(), controllStyle.get(fontChange.getjFontStyleInput().getText()), cuFont.getSize());
            fontChange.getjListStyle().setSelectedIndex(controllStyle.get(fontChange.getjFontStyleInput().getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Font Style within the allowed range!");
        }
    }

    private void jFontSizeInputActionPerformed(ActionEvent evt) {
        try {
            int userInput = Integer.parseInt(fontChange.getjFontSizeInput().getText());
            if (userInput <= 48) {
                cuFont = new Font(cuFont.getFamily(), cuFont.getStyle(), userInput);
                LoadListSize();
            } else {
                JOptionPane.showMessageDialog(null, "Please enter Size <= 48!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input number!");
        }
    }
}
