package hwSem3.task2;

import java.io.*;
import java.nio.file.Files;

public class FileManager {

//    public FileManager() {
//    }

    public static void read(String fileName) throws IOException {
        System.out.println("Reading...");

        BufferedReader fin = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = fin.readLine()) != null) {
            System.out.printf(line + "%n");
        }
        fin.close();
    }
    public static void write(String fileName) throws WriteException {
        System.out.println("Writing...");
        try(FileWriter writer = new FileWriter(fileName, true)) {

            String text = "New string";
            writer.write(text);
            writer.append('\n');
            writer.flush();
            System.out.println("Write successfully");

            //throw new IOException("Error operation...");
        } catch (IOException e) {
            throw new WriteException("Unsuccessful write. ", e);
        }
    }

    public static void copyFile(File source, File dest) throws CopyException{
        System.out.println("Copying...");
        try {
            Files.copy(source.toPath(), dest.toPath());
            System.out.println("Successfully copied");
            //throw new CopyException("Error copy.");
        } catch (IOException e) {
            System.out.println("Copy failed. File: " + e.getMessage() + " is exists..");
        }
    }
}
