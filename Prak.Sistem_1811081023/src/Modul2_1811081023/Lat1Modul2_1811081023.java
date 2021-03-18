/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat1Modul2_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pet1811081023 = "File_1811081023/Lat1Modul2_1811081023.txt";
        OutputStream outputStream = new FileOutputStream(pet1811081023);
        
        System.out.println("Open " + pet1811081023 + " for write");
        
        String dataWrite1811081023 = "Ini adalah tugas pertama modul 2";
        for (int i = 0; i < dataWrite1811081023.length(); i++) {
            outputStream.write((byte) dataWrite1811081023.charAt(i));
        } outputStream.close();
        
        System.out.println("Output stream closed . . .");
        
        InputStream file1811081023 = new FileInputStream(pet1811081023);
        int data1811081023 = file1811081023.read();
        
        while (data1811081023 != -1) {            
            System.out.print((char) data1811081023);
            data1811081023 = file1811081023.read();
        } System.out.println("");
        
        file1811081023.close();
        
        
    }
}
