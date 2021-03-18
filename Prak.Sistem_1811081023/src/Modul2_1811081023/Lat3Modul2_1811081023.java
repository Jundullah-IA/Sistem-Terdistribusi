/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat3Modul2_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Menu :");
        System.out.println("-------------------------\n");
        System.out.println("1 - Menulis dengan stream");
        System.out.println("2 - Menulis dengan Filewriter/BufferedWriter");
        System.out.println("3 - Exit \n\n");

        System.out.print("Please input your selection :");
        selection = input.nextInt();
        System.out.println("User choice : " + selection);
        
        switch(selection) {
            case 1 : {
                InputStream file1811081023 = new FileInputStream("File_1811081023/ReadFile_1811081023.txt");
                int data1811081023 = file1811081023.read();
                System.out.println(data1811081023);

                while (data1811081023 != -1) {            
        //            System.out.print((char) data1811081023);
                    data1811081023 = file1811081023.read();

                    System.out.println(data1811081023);
                } System.out.println("");

                file1811081023.close();
            } break;
            
            case 2 : {
                
            } break;
                
            case 3 : {
                System.out.println("System end");
            } break;
            
        }
    }
}
