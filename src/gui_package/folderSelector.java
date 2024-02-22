/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_package;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IMMORTAL
 */
public class folderSelector {
    
     private final List<String> selectedFolders;
     
     public folderSelector() {
        selectedFolders = new ArrayList<>();
    
}
     
     public List<String> getSelectedFolders() {
        return selectedFolders;
     }
     
        public void selectFolders(JFrame parentFrame) {
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setDialogTitle("Select Folders");
            fileChooser.setMultiSelectionEnabled(true);
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
            int userSelection = fileChooser.showOpenDialog(parentFrame);
         
         if (userSelection == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File file : selectedFiles) {
                selectedFolders.add(file.getAbsolutePath());
     
            }
        }
    }
}
