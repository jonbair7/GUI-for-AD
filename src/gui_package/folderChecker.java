/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_package;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.Date;

/**
 *
 * @author IMMORTAL
 */
public class folderChecker {
    
    private final String[] folderLocations;
    private final DefaultTableModel model;

    public folderChecker(String[] folderLocations, DefaultTableModel model) {
        this.folderLocations = folderLocations;
        this.model = model;
    }
    
    public void checkFoldersOlderThanSixMonths() {
       model.setRowCount(0);
       
       long currentTime = System.currentTimeMillis();
       
       for (String folderLocation : folderLocations) {
            File folder = new File(folderLocation);
            
        if (folder.exists() && folder.isDirectory()) {
             File[] files = folder.listFiles();
             
          for (File file : files) {
                  long creationTime = file.lastModified();
                  long sixMonthsAgo = currentTime - (6 * 30 * 24 * 60 * 60 * 1000); // Calculate 6 months ago
                  
                  if (creationTime < sixMonthsAgo) {
                        model.addRow(new Object[]{file.getName(), new Date(creationTime)});
                  }
            }
        }                    
    }
}
}
