/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081023;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat2Modul3_1811081023 {
    String path = "File_1811081023/SerializationArray_1811081023.txt";
    
    public void serial_1811081023(ArrayList<Lat1Modul3_1811081023> students) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
            outputStream.writeObject(students);
            outputStream.close();
            Lat1Modul3_1811081023 print = new Lat1Modul3_1811081023();
            print.printData_1811081023();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lat2Modul3_1811081023 array = new Lat2Modul3_1811081023();
        ArrayList<Lat1Modul3_1811081023> students = new ArrayList<Lat1Modul3_1811081023>();
        
        int pilihan = 1;
            System.out.println("Menu : ");
            System.out.println("1. Add");
            System.out.println("2. Menu");
            System.out.print("Masukkan pilihan ; ");
            pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1 : {
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    nama = input.nextLine();

                    System.out.print("NoBP : ");
                    String nobp = input.nextLine();

                    System.out.print("Matakuliah : ");
                    String matakuliah = input.nextLine();

                    System.out.print("Nilai : ");
                    int nilai = input.nextInt();
                    
                    String nilaiHuruf = null, status = null;
                    if( nilai >= 85 ) {
                        nilaiHuruf  = "A";
                        status = "Lulus";
                    } else if( nilai >= 80 ) {
                        nilaiHuruf  = "A-";
                        status = "Lulus";
                    } else if( nilai >= 70 ) {
                        nilaiHuruf  = "B+";
                        status = "Lulus";
                    } else if( nilai >= 60 ) {
                        nilaiHuruf  = "B";
                        status = "Lulus";
                    } else if( nilai >= 50 ) {
                        nilaiHuruf  = "C+";
                        status = "Lulus";
                    } else if( nilai >= 40 ) {
                        nilaiHuruf  = "C";
                        status = "Gagal";
                    } else if( nilai < 40 ) {
                        nilaiHuruf  = "D";
                        status = "Gagal";
                    }
                    
                    students.add(new Lat1Modul3_1811081023(nama, nobp, matakuliah, nilai, nilaiHuruf, status));
                } break;
                    
                case 2 : {
                    
                } break;
            }
        
        array.serial_1811081023(students);
    }
}
