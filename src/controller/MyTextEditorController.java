/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import handler.HandlerEdit;
import handler.HandlerFile;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;
import view.MyTextEditor;

/**
 *
 * @author duchi
 */
public class MyTextEditorController {

    private MyTextEditor editor = new MyTextEditor();
    private HandlerEdit edit = new HandlerEdit();
    private HandlerFile file = new HandlerFile();
    private UndoManager um = new UndoManager();

    private File fileToSave;

    public MyTextEditor getEditor() {
        return editor;
    }

    

    public MyTextEditorController() {
        editor.setVisible(true);
        Document document = editor.getjTextAreaNote().getDocument();
        document.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                um.addEdit(e.getEdit());
            }

        });
        editor.getjMenuEdit().addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }

            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }

            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuEditMenuSelected(evt);
            }

        });
        editor.getjOptionNew().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionNewActionPerformed(evt);
            }

        });
        editor.getjOptionOpen().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionOpenActionPerformed(evt);
            }

        });
        editor.getjOptionSave().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSaveActionPerformed(evt);
            }

        });
        editor.getjOptionSaveAs().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSaveAsActionPerformed(evt);
            }

        });
        editor.getjOptionExit().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionExitActionPerformed(evt);
            }

        });
        editor.getjOptionUndo().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionUndoActionPerformed(evt);
            }

        });
        editor.getjOptionRedo().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionRedoActionPerformed(evt);
            }

        });
        editor.getjOptionCut().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionCutActionPerformed(evt);
            }

        });
        editor.getjOptionCopy().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionCopyActionPerformed(evt);
            }

        });
        editor.getjOptionPaste().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionPasteActionPerformed(evt);
            }

        });
        editor.getjOptionFind().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionFindActionPerformed(evt);
            }

        });
        editor.getjOptionReplace().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionReplaceActionPerformed(evt);
            }

        });
        editor.getjOptionSelectAll().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSelectAllActionPerformed(evt);
            }

        });
        editor.getjOptionFont().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionFontActionPerformed(evt);
            }

        });

    }

    private void jMenuEditMenuSelected(MenuEvent evt) {
        boolean setFind = !"".equals(editor.getjTextAreaNote().getText());
        editor.getjOptionFind().setEnabled(setFind);
        boolean setEdit = !(editor.getjTextAreaNote().getSelectedText() == null);
        editor.getjOptionCopy().setEnabled(setEdit);
        editor.getjOptionCut().setEnabled(setEdit);

    }

    private void jOptionNewActionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showDialog(editor, "create");

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            fileToSave = fileChooser.getSelectedFile();

            file.save(fileToSave, "");
            editor.getjTextAreaNote().setText("");
        }
    }

    private void jOptionOpenActionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to open");

        int userSelection = fileChooser.showOpenDialog(editor);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            fileToSave = fileChooser.getSelectedFile();

            editor.getjTextAreaNote().setText(file.read(fileToSave));
        }
    }

    private void jOptionSaveActionPerformed(ActionEvent evt) {
        if (fileToSave == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");

            int userSelection = fileChooser.showSaveDialog(editor);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                fileToSave = fileChooser.getSelectedFile();

                file.save(fileToSave, editor.getjTextAreaNote().getText());
            }
        } else {
            file.save(fileToSave, editor.getjTextAreaNote().getText());
        }
    }

    private void jOptionSaveAsActionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(editor);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            fileToSave = fileChooser.getSelectedFile();

            file.save(fileToSave, editor.getjTextAreaNote().getText());
        }
    }

    private void jOptionExitActionPerformed(ActionEvent evt) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(editor, "Your Message", "Title on Box", dialogButton);
        if (dialogResult == 0) {
            file.save(fileToSave, editor.getjTextAreaNote().getText());
            System.out.println("Yes option");
            System.exit(0);
        } else {
            System.out.println("No Option");
            System.exit(0);
        }
    }

    private void jOptionUndoActionPerformed(ActionEvent evt) {
        if (um.canUndo()) {
            um.undo();
        }
    }

    private void jOptionRedoActionPerformed(ActionEvent evt) {
        if (um.canRedo()) {
            um.redo();
        }
    }

    private void jOptionCutActionPerformed(ActionEvent evt) {
        editor.getjTextAreaNote().cut();
    }

    private void jOptionCopyActionPerformed(ActionEvent evt) {
        editor.getjTextAreaNote().copy();
    }

    private void jOptionPasteActionPerformed(ActionEvent evt) {
        editor.getjTextAreaNote().paste();
    }

    private void jOptionFindActionPerformed(ActionEvent evt) {
       FindController findController = new FindController(this);

       
    }

    private void jOptionReplaceActionPerformed(ActionEvent evt) {
        ReplaceController replaceController = new ReplaceController(editor);

    }

    private void jOptionSelectAllActionPerformed(ActionEvent evt) {
        editor.getjTextAreaNote().selectAll();
    }

    private void jOptionFontActionPerformed(ActionEvent evt) {
        FontController fontController = new FontController(editor);

    }
}
