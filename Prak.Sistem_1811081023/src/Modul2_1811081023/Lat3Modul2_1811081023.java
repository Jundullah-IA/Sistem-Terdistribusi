/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat3Modul2_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException  {
         int selection;
         String userInput;
         Scanner input = new Scanner(System.in);
         String pet1811081023 = "File_1811081023/WriteFile_1811081023.txt";

        System.out.println("Menu :");
        System.out.println("-------------------------\n");
        System.out.println("1 - Menulis dengan stream");
        System.out.println("2 - Menulis dengan Filewriter/BufferedWriter");
        System.out.println("3 - Exit \n");

        System.out.print("Please input your selection : ");
        selection = input.nextInt();
        System.out.println("User choice : " + selection + "\n");
        
         switch(selection) {             
             case 1 : {
                OutputStream outputStream = new FileOutputStream(pet1811081023);

                System.out.println("Open " + pet1811081023 + " for write");
                System.out.print("Input text ro write : ");
                userInput = input.nextLine();
                userInput = input.nextLine();
                
                for (int i = 0; i < userInput.length(); i++) {
                    outputStream.write((byte) userInput.charAt(i));
                } outputStream.close();

                System.out.println("Output stream closed . . .");
             } break;
            
             case 2 : {
                File file = new File(pet1811081023);
                FileWriter writer = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                
                System.out.println("Open " + pet1811081023 + " for write");
                System.out.print("Input text ro write : ");
                userInput = input.nextLine();
                userInput = input.nextLine();

                bufferedWriter.write(userInput);
                bufferedWriter.close();
             } break;
                
             case 3 : {
                 System.out.println("System end");
             } break;
         }
    }
}
