/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat2Modul2_1811081023 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write user input : ");
        String userInput = reader.readLine();
        
        System.out.println("Data dari user : " + userInput);
        
        String pet1811081023 = "File_1811081023/Lat2Modul2_1811081023.txt";
        OutputStream outputStream = new FileOutputStream(pet1811081023);
        
        System.out.println("Open " + pet1811081023 + " for write");
        
        for (int i = 0; i < userInput.length(); i++) {
            outputStream.write((byte) userInput.charAt(i));
        } outputStream.close();
        
        System.out.println("Output stream closed . . .");
    }
}
