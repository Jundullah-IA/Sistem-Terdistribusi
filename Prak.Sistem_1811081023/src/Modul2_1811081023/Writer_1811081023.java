/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author LABSIKOMP03
 */
public class Writer_1811081023 {

    public static void main(String[] args) throws IOException {
        String content1811081023 = "Cara menulis file dengan fileWriter";
        File file = new File("File_1811081023/WriteFile_1811081023.txt");
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        
        bufferedWriter.write(content1811081023);
        bufferedWriter.close();
        
        
    }
}
