/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LABSIKOMP03
 */
public class BufferedReader_1811081023 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader( 
                new FileReader("File_1811081023/ReadFile_1811081023.txt"));
        
        String line = null;
        while ( (line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        
    }
    
}
