/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_package;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

/**
 *
 * @author IMMORTAL
 */

public class agentFolderExporter {

    public agentFolderExporter(String outputFile) {
    }
    
    public void processAgentFolders(String folderLocation, agentFolderExporter exporter) {
        File folder = new File(folderLocation);

        if (folder.exists() && folder.isDirectory()) {
            try {
                Files.walkFileTree(Paths.get(folderLocation), new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        if (Files.isDirectory(file)) {
                            String folderName = file.toFile().getName();
                            String creationTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(attrs.creationTime().toMillis());
                            String lastAccessTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(attrs.lastAccessTime().toMillis());

                            exporter.export(folderName, creationTime, lastAccessTime);
                        }
                        return FileVisitResult.CONTINUE;
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Folder does not exist: " + folderLocation);
        }
    }
    public void export(String folderName, String creationTime, String lastAccessTime) {
        
        System.out.println("Exporting folder information...");
        System.out.println("Folder: " + folderName + ", Creation Time: " + creationTime + ", Last Access Time: " + lastAccessTime);
    }
}
