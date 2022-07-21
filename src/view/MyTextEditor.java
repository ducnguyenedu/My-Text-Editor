/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.print.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;
import javax.swing.text.*;
import javax.swing.undo.*;

/**
 *
 * @author lab026
 */
public class MyTextEditor extends javax.swing.JFrame {

    /**
     * Creates new form MyTextEditorFrame
     */
    public MyTextEditor() {
        initComponents();

    }

    public JMenuItem getjMenuItemCopy() {
        return jOptionCopy;
    }

    public void setjMenuItemCopy(JMenuItem jMenuItemCopy) {
        this.jOptionCopy = jMenuItemCopy;
    }

    public JMenuItem getjMenuItemCut() {
        return jOptionCut;
    }

    public void setjMenuItemCut(JMenuItem jMenuItemCut) {
        this.jOptionCut = jMenuItemCut;
    }

    

    public JMenuItem getjMenuItemExit() {
        return jOptionExit;
    }

    public void setjMenuItemExit(JMenuItem jMenuItemExit) {
        this.jOptionExit = jMenuItemExit;
    }

    public JMenuItem getjMenuItemFind() {
        return jOptionFind;
    }

    public void setjMenuItemFind(JMenuItem jMenuItemFind) {
        this.jOptionFind = jMenuItemFind;
    }

    public JMenuItem getjMenuItemFont() {
        return jOptionFont;
    }

    public void setjMenuItemFont(JMenuItem jMenuItemFont) {
        this.jOptionFont = jMenuItemFont;
    }

    public JMenuItem getjMenuItemNew() {
        return jOptionNew;
    }

    public void setjMenuItemNew(JMenuItem jMenuItemNew) {
        this.jOptionNew = jMenuItemNew;
    }

    public JMenuItem getjMenuItemOpen() {
        return jOptionOpen;
    }

    public void setjMenuItemOpen(JMenuItem jMenuItemOpen) {
        this.jOptionOpen = jMenuItemOpen;
    }

    public JMenuItem getjMenuItemPaste() {
        return jOptionPaste;
    }

    public void setjMenuItemPaste(JMenuItem jMenuItemPaste) {
        this.jOptionPaste = jMenuItemPaste;
    }

    

    public JMenuItem getjMenuItemRedo() {
        return jOptionRedo;
    }

    public void setjMenuItemRedo(JMenuItem jMenuItemRedo) {
        this.jOptionRedo = jMenuItemRedo;
    }

    public JMenuItem getjMenuItemReplace() {
        return jOptionReplace;
    }

    public void setjMenuItemReplace(JMenuItem jMenuItemReplace) {
        this.jOptionReplace = jMenuItemReplace;
    }

    public JMenuItem getjMenuItemSave() {
        return jOptionSave;
    }

    public void setjMenuItemSave(JMenuItem jMenuItemSave) {
        this.jOptionSave = jMenuItemSave;
    }

    public JMenuItem getjMenuItemSaveAs() {
        return jOptionSaveAs;
    }

    public void setjMenuItemSaveAs(JMenuItem jMenuItemSaveAs) {
        this.jOptionSaveAs = jMenuItemSaveAs;
    }

    public JMenuItem getjMenuItemSelectAll() {
        return jOptionSelectAll;
    }

    public void setjMenuItemSelectAll(JMenuItem jMenuItemSelectAll) {
        this.jOptionSelectAll = jMenuItemSelectAll;
    }

    public JMenuItem getjMenuItemUndo() {
        return jOptionUndo;
    }

    public void setjMenuItemUndo(JMenuItem jMenuItemUndo) {
        this.jOptionUndo = jMenuItemUndo;
    }

    public JTextArea getjTextAreaNote() {
        return jTextAreaNote;
    }

    public void setjTextAreaNote(JTextArea jTextAreaNote) {
        this.jTextAreaNote = jTextAreaNote;
    }

    public JMenuItem getjOptionCopy() {
        return jOptionCopy;
    }

    public void setjOptionCopy(JMenuItem jOptionCopy) {
        this.jOptionCopy = jOptionCopy;
    }

    public JMenuItem getjOptionCut() {
        return jOptionCut;
    }

    public void setjOptionCut(JMenuItem jOptionCut) {
        this.jOptionCut = jOptionCut;
    }

    public JMenuItem getjOptionExit() {
        return jOptionExit;
    }

    public void setjOptionExit(JMenuItem jOptionExit) {
        this.jOptionExit = jOptionExit;
    }

    public JMenuItem getjOptionFind() {
        return jOptionFind;
    }

    public void setjOptionFind(JMenuItem jOptionFind) {
        this.jOptionFind = jOptionFind;
    }

    public JMenuItem getjOptionFont() {
        return jOptionFont;
    }

    public void setjOptionFont(JMenuItem jOptionFont) {
        this.jOptionFont = jOptionFont;
    }

    public JMenuItem getjOptionNew() {
        return jOptionNew;
    }

    public void setjOptionNew(JMenuItem jOptionNew) {
        this.jOptionNew = jOptionNew;
    }

    public JMenuItem getjOptionOpen() {
        return jOptionOpen;
    }

    public void setjOptionOpen(JMenuItem jOptionOpen) {
        this.jOptionOpen = jOptionOpen;
    }

    public JMenuItem getjOptionPaste() {
        return jOptionPaste;
    }

    public void setjOptionPaste(JMenuItem jOptionPaste) {
        this.jOptionPaste = jOptionPaste;
    }

    public JMenuItem getjOptionRedo() {
        return jOptionRedo;
    }

    public void setjOptionRedo(JMenuItem jOptionRedo) {
        this.jOptionRedo = jOptionRedo;
    }

    public JMenuItem getjOptionReplace() {
        return jOptionReplace;
    }

    public void setjOptionReplace(JMenuItem jOptionReplace) {
        this.jOptionReplace = jOptionReplace;
    }

    public JMenuItem getjOptionSave() {
        return jOptionSave;
    }

    public void setjOptionSave(JMenuItem jOptionSave) {
        this.jOptionSave = jOptionSave;
    }

    public JMenuItem getjOptionSaveAs() {
        return jOptionSaveAs;
    }

    public void setjOptionSaveAs(JMenuItem jOptionSaveAs) {
        this.jOptionSaveAs = jOptionSaveAs;
    }

    public JMenuItem getjOptionSelectAll() {
        return jOptionSelectAll;
    }

    public void setjOptionSelectAll(JMenuItem jOptionSelectAll) {
        this.jOptionSelectAll = jOptionSelectAll;
    }

    public JMenuItem getjOptionUndo() {
        return jOptionUndo;
    }

    public void setjOptionUndo(JMenuItem jOptionUndo) {
        this.jOptionUndo = jOptionUndo;
    }

    public JMenu getjMenuEdit() {
        return jMenuEdit;
    }

    public void setjMenuEdit(JMenu jMenuEdit) {
        this.jMenuEdit = jMenuEdit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jOptionNew = new javax.swing.JMenuItem();
        jOptionOpen = new javax.swing.JMenuItem();
        jOptionSave = new javax.swing.JMenuItem();
        jOptionSaveAs = new javax.swing.JMenuItem();
        jSeparatorFile1 = new javax.swing.JPopupMenu.Separator();
        jSeparatorFile2 = new javax.swing.JPopupMenu.Separator();
        jOptionExit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jOptionUndo = new javax.swing.JMenuItem();
        jOptionRedo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jOptionCut = new javax.swing.JMenuItem();
        jOptionCopy = new javax.swing.JMenuItem();
        jOptionPaste = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jOptionFind = new javax.swing.JMenuItem();
        jOptionReplace = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jOptionSelectAll = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jOptionFont = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Text Editor (MTE)");

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextAreaNote.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNote);

        jMenuFile.setMnemonic('f');
        jMenuFile.setText("File");

        jOptionNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jOptionNew.setMnemonic('n');
        jOptionNew.setText("New");
        jOptionNew.setToolTipText("");
        jOptionNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jOptionNew);

        jOptionOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jOptionOpen.setMnemonic('o');
        jOptionOpen.setText("Open");
        jOptionOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionOpenActionPerformed(evt);
            }
        });
        jMenuFile.add(jOptionOpen);

        jOptionSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jOptionSave.setMnemonic('s');
        jOptionSave.setText("Save");
        jOptionSave.setToolTipText("");
        jOptionSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSaveActionPerformed(evt);
            }
        });
        jMenuFile.add(jOptionSave);

        jOptionSaveAs.setMnemonic('a');
        jOptionSaveAs.setText("Save As");
        jOptionSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSaveAsActionPerformed(evt);
            }
        });
        jMenuFile.add(jOptionSaveAs);
        jMenuFile.add(jSeparatorFile1);
        jMenuFile.add(jSeparatorFile2);

        jOptionExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jOptionExit.setMnemonic('x');
        jOptionExit.setText("Exit");
        jOptionExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jOptionExit);

        jMenuBar.add(jMenuFile);

        jMenuEdit.setMnemonic('e');
        jMenuEdit.setText("Edit");
        jMenuEdit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuEditMenuSelected(evt);
            }
        });

        jOptionUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jOptionUndo.setMnemonic('u');
        jOptionUndo.setText("Undo");
        jOptionUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionUndoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionUndo);

        jOptionRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jOptionRedo.setMnemonic('r');
        jOptionRedo.setText("Redo");
        jOptionRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionRedoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionRedo);
        jMenuEdit.add(jSeparator1);

        jOptionCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jOptionCut.setMnemonic('t');
        jOptionCut.setText("Cut");
        jOptionCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionCutActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionCut);

        jOptionCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jOptionCopy.setMnemonic('c');
        jOptionCopy.setText("Copy");
        jOptionCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionCopyActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionCopy);

        jOptionPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jOptionPaste.setMnemonic('p');
        jOptionPaste.setText("Paste");
        jOptionPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionPasteActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionPaste);
        jMenuEdit.add(jSeparator2);

        jOptionFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jOptionFind.setMnemonic('f');
        jOptionFind.setText("Find");
        jOptionFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionFindActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionFind);

        jOptionReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jOptionReplace.setMnemonic('r');
        jOptionReplace.setText("Replace");
        jOptionReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionReplaceActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionReplace);
        jMenuEdit.add(jSeparator3);

        jOptionSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jOptionSelectAll.setMnemonic('a');
        jOptionSelectAll.setText("Select All");
        jOptionSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionSelectAllActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionSelectAll);
        jMenuEdit.add(jSeparator4);

        jOptionFont.setText("Font change");
        jOptionFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionFontActionPerformed(evt);
            }
        });
        jMenuEdit.add(jOptionFont);

        jMenuBar.add(jMenuEdit);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEditMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuEditMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEditMenuSelected

    private void jOptionUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionUndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionUndoActionPerformed

    private void jOptionRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionRedoActionPerformed

    private void jOptionCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionCutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionCutActionPerformed

    private void jOptionCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionCopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionCopyActionPerformed

    private void jOptionPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionPasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionPasteActionPerformed

    private void jOptionFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionFindActionPerformed

    private void jOptionReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionReplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionReplaceActionPerformed

    private void jOptionSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionSelectAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionSelectAllActionPerformed

    private void jOptionFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionFontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionFontActionPerformed

    private void jOptionNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionNewActionPerformed

    private void jOptionOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionOpenActionPerformed

    private void jOptionSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionSaveActionPerformed

    private void jOptionSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionSaveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionSaveAsActionPerformed

    private void jOptionExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTextEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jOptionCopy;
    private javax.swing.JMenuItem jOptionCut;
    private javax.swing.JMenuItem jOptionExit;
    private javax.swing.JMenuItem jOptionFind;
    private javax.swing.JMenuItem jOptionFont;
    private javax.swing.JMenuItem jOptionNew;
    private javax.swing.JMenuItem jOptionOpen;
    private javax.swing.JMenuItem jOptionPaste;
    private javax.swing.JMenuItem jOptionRedo;
    private javax.swing.JMenuItem jOptionReplace;
    private javax.swing.JMenuItem jOptionSave;
    private javax.swing.JMenuItem jOptionSaveAs;
    private javax.swing.JMenuItem jOptionSelectAll;
    private javax.swing.JMenuItem jOptionUndo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparatorFile1;
    private javax.swing.JPopupMenu.Separator jSeparatorFile2;
    private javax.swing.JTextArea jTextAreaNote;
    // End of variables declaration//GEN-END:variables
}
