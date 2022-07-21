/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import handler.HandlerEdit;
import java.awt.event.ActionEvent;
import view.Find;
import view.MyTextEditor;
import view.Replace;

/**
 *
 * @author duchi
 */
public class FindController {

    private HandlerEdit edit = new HandlerEdit();
    private Find find;
    private MyTextEditorController editor;

    public FindController(MyTextEditorController editor) {
        this.editor = editor;
        find = new Find(editor.getEditor(), false);
        find.setVisible(true);
        find.getjButtonFindNext().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindNextActionPerformed(evt);
            }
        });
    }

    private void jButtonFindNextActionPerformed(ActionEvent evt) {
        
        System.out.println(editor.getEditor().getjTextAreaNote().getText());
        System.out.println(find.getjTextFieldFind().getText());
        System.out.println(find.getjRadioButtonUp().isSelected());
        edit.FindText(find.getjTextFieldFind().getText(), editor.getEditor().getjTextAreaNote(), find.getjRadioButtonUp().isSelected());
    }
}
