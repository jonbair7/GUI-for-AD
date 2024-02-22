/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_package;

import java.io.File;

/**
 *
 * @author IMMORTAL
 */
public class folderDeleter {
    
        public void deleteFolders(java.util.List<String> foldersToDelete) {
            for (String folderPath : foldersToDelete) {
                File folder = new File(folderPath);
                deleteFolder(folder);
        }
    }
        
         private void deleteFolder(File folder) {
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                    if (files != null) {
                        for (File file : files) {
                            deleteFolder(file);
                }
            }
        }
        folder.delete();
    
    }
}