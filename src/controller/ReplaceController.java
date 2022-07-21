/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import handler.HandlerEdit;
import java.awt.event.ActionEvent;
import view.MyTextEditor;
import view.Replace;

/**
 *
 * @author duchi
 */
public class ReplaceController {

    private Replace replace;
    private MyTextEditor editor;
    private HandlerEdit edit= new HandlerEdit();

    public ReplaceController(MyTextEditor editor) {
        this.editor = editor;
        replace = new Replace(editor, false);
        replace.setVisible(true);
        replace.getjButtonFindNext().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindNextActionPerformed(evt);
            }

        });
        replace.getjButtonReplace().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceActionPerformed(evt);
            }

        });

        replace.getjButtonReplaceAll().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceAllActionPerformed(evt);
            }

        });
    }

    private void jButtonFindNextActionPerformed(ActionEvent evt) {
        edit.FindText(replace.getjTextFieldFind().getText(), editor.getjTextAreaNote(), true);
    }

    private void jButtonReplaceActionPerformed(ActionEvent evt) {
        edit.ReplaceText(replace.getjTextFieldFind().getText(), replace.getjTextFieldReplace().getText(), editor.getjTextAreaNote());
    }

    private void jButtonReplaceAllActionPerformed(ActionEvent evt) {
        edit.ReplaceAll(replace.getjTextFieldFind().getText(),
                 replace.getjTextFieldReplace().getText(),
                 editor.getjTextAreaNote()
        );
    }
}
