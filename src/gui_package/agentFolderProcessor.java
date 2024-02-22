/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_package;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author IMMORTAL
 */
public class agentFolderProcessor {
     private String outputFile;

     // Constructor
    public agentFolderProcessor(String outputFile) {
        this.outputFile = outputFile;
    }

    public void export(String folderName, String creationTime, String lastAccessTime) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            // Write folder info to file
            writer.write("Folder: " + folderName + ", Creation Time: " + creationTime + ", Last Access Time: " + lastAccessTime + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
