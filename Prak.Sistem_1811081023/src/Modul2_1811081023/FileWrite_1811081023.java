/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author LABSIKOMP03
 */
public class FileWrite_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pet1811081023 = "File_1811081023/WriteFile_1811081023.txt";
        OutputStream outputStream = new FileOutputStream(pet1811081023);
        
        System.out.println("Open " + pet1811081023 + " for write");
        
        String data1811081023 = "Hello new file!";
        for (int i = 0; i < data1811081023.length(); i++) {
            outputStream.write((byte) data1811081023.charAt(i));
        } outputStream.close();
        
        System.out.println("Output stream closed . . .");
    }
}
