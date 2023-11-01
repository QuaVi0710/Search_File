/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author QuaVi
 */
public class Library {

    public static int countWordInFile(String fileSource, String word) {
        FileReader fr = null;
        try {
            fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] token = line.split(" ");
                for (String w : token) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = br.readLine();
            }
            return count;
        } catch (FileNotFoundException ex) {
            //ignore
        } catch (IOException ex) {
            //ignore
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return 0;
    }

    public static void findFilesWithWordInDirectory(String source, String word) {
        try {
            File folder = new File(source);
            if (!folder.exists() || !folder.isDirectory() || !folder.isAbsolute()) {
                throw new IllegalArgumentException(" Folder is not Exists");
            }
            File[] listOfFiles = folder.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile()) {
                    if (countWordInFile(file.getAbsolutePath(), word) != 0) {
                        System.out.println("file name: " + file.getName());
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Opp" + e.getMessage());
        }
    }

}
