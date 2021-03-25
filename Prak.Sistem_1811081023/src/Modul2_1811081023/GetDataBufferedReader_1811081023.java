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
public class GetDataBufferedReader_1811081023 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pet1811081023 = "File_1811081023/Konfigurasi_1811081023.conf";
        BufferedReader br = new BufferedReader( new FileReader(pet1811081023) );

        String line = null;
        while ( (line = br.readLine()) != null) {
            String[] konfigurasi = line.split("@");

            System.out.println("host : " + konfigurasi[0]);
            System.out.println("User : " + konfigurasi[1]);
            System.out.println("Password : " +konfigurasi[2]);
            System.out.println("Port : " + konfigurasi[3]);
            System.out.println("Database : " + konfigurasi[4]);
        } br.close();
    }
}
