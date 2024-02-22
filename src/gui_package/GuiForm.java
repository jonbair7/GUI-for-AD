/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_package;

import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


/**
 *
 * @author IMMORTAL
 */
public class GuiForm extends javax.swing.JFrame {
    
    private agentFolderProcessor folderProcessor;
    
    private agentFolderExporter folderExporter;
    
    private folderSelector folderSelector;
    
    private final String[] folderLocations = {
/*
        
        LOCATIONS GO HERE, 
        
        */
    };
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public GuiForm() {
        initComponents();
        folderProcessor = new agentFolderProcessor("output.txt"); // Adjust the output file path as needed
        folderExporter = new agentFolderExporter("output.txt"); // Adjust the output file path as needed
        folderSelector = new folderSelector();
        
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    private void initComponents() {
//        // Existing initComponents() method remains unchanged
//
//        // Add ActionListener for "List Folders Oldest" button
//         List_Folders_Oldest = new javax.swing.JButton();
//         
//         
//        List_Folders_Oldest.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                listOldestFolders();
//            }
//        });
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        List_Folders_Oldest = new javax.swing.JButton();
        List_Folders_Newest = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Export_to_Excel = new javax.swing.JButton();
        Folder_Oldr_6months = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        List_Folders_Oldest.setBackground(new java.awt.Color(0, 153, 0));
        List_Folders_Oldest.setText("List Folders Oldest");
        List_Folders_Oldest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List_Folders_OldestActionPerformed(evt);
            }
        });

        List_Folders_Newest.setBackground(new java.awt.Color(0, 153, 0));
        List_Folders_Newest.setText("List Folders Newest");
        List_Folders_Newest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List_Folders_NewestActionPerformed(evt);
            }
        });

        Select.setBackground(new java.awt.Color(0, 153, 0));
        Select.setText("Select");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Export_to_Excel.setBackground(new java.awt.Color(0, 153, 0));
        Export_to_Excel.setText("Export to Excel");
        Export_to_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_to_ExcelActionPerformed(evt);
            }
        });

        Folder_Oldr_6months.setBackground(new java.awt.Color(0, 153, 0));
        Folder_Oldr_6months.setText("Folders > 6 months");
        Folder_Oldr_6months.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Folder_Oldr_6monthsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Agent Name", "Date Created", "Date Last Accessed"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Folder_Oldr_6months, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Select, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(List_Folders_Newest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(List_Folders_Oldest, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Export_to_Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(List_Folders_Oldest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(List_Folders_Newest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Export_to_Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Folder_Oldr_6months, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    1
    private void List_Folders_OldestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List_Folders_OldestActionPerformed
        // TODO add your handling code here:
        listOldestFolders();
    }//GEN-LAST:event_List_Folders_OldestActionPerformed

    private void listOldestFolders() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing table data

    // Process agent folders and display in table
    folderExporter.processAgentFolders(folderLocations[0], folderExporter); // Adjust folderLocation as needed
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    1
    
    
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  2
    private void List_Folders_NewestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List_Folders_NewestActionPerformed
         listNewestFolders();
    }//GEN-LAST:event_List_Folders_NewestActionPerformed

private void listNewestFolders() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing table data

    // Process agent folders and display in table
    folderExporter.processAgentFolders(folderLocations[2], folderExporter); // Adjust folderLocation as needed
}     
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  2


 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  3
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        folderSelector folderSelector = new folderSelector();
        
        folderSelector.selectFolders(this);
        
        List<String> selectedFolders = folderSelector.getSelectedFolders();
        
        for (String folder : selectedFolders) {
            System.out.println("Selected Folder: " + folder);
        
    }//GEN-LAST:event_SelectActionPerformed
    }
    
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  3
 
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  4
    
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      
        
        if (folderSelector == null) {
            folderSelector = new folderSelector();
            
            folderSelector.selectFolders(this);
            
            List<String> selectedFolders = folderSelector.getSelectedFolders();
            
            if (!selectedFolders.isEmpty()) {
                folderDeleter folderDeleter = new folderDeleter();
                folderDeleter.deleteFolders(selectedFolders);
                
            } else{
                        JOptionPane.showMessageDialog(this, "Please select folders to delete.");
                        }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  4
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 5
    private void Export_to_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_to_ExcelActionPerformed
       agentFolderExporter exporter = new agentFolderExporter("output.txt"); // Assuming "output.txt" is the outputFile
       
       exporter.export("folderName", "creationTime", "lastAccessTime");
    }//GEN-LAST:event_Export_to_ExcelActionPerformed
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 5
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 6
    private void Folder_Oldr_6monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Folder_Oldr_6monthsActionPerformed
        folderChecker folderChecker = new folderChecker(folderLocations, (DefaultTableModel) jTable1.getModel());
        folderChecker.checkFoldersOlderThanSixMonths();
    }//GEN-LAST:event_Folder_Oldr_6monthsActionPerformed
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 6
    
    
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
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Export_to_Excel;
    private javax.swing.JButton Folder_Oldr_6months;
    private javax.swing.JButton List_Folders_Newest;
    private javax.swing.JButton List_Folders_Oldest;
    private javax.swing.JButton Select;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

