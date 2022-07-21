/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author duchi
 */
public class HandlerFile {

    public HandlerFile() {
    }

    public String read(File open) {
        String data = "";
        try {
            File myObj = open;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = data+myReader.nextLine()+"\n";

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public void save(File fileToSave, String content) {
        try {
            FileWriter myWriter = new FileWriter(fileToSave);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
