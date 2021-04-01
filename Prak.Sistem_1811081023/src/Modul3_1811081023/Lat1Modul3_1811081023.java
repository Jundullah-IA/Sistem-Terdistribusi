/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081023;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author LABSIKOMP03
 */
public class Lat1Modul3_1811081023 implements Serializable{
    String path = "File_1811081023/Lat1Modul3_1811081023.txt";
    String nama, nobp, mataKuliah, nilaiHuruf, status;
    int nilai;

    public Lat1Modul3_1811081023() {
    }
    
    public Lat1Modul3_1811081023(String nama, String nobp, String mataKuliah, int nilai, String nilaiHuruf, String status) {
        this.nama = nama;
        this.nobp = nobp;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
        this.nilaiHuruf = nilaiHuruf;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public void setNilaiHuruf(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    public void printData_1811081023() throws FileNotFoundException, JavaLayerException {
        System.out.println("\nData Masuk : ");
        System.out.println("Nama : " + getNama());
        System.out.println("NoBP : " + getNobp());
        System.out.println("Matakuliah : " + getMataKuliah());
        System.out.println("Nilai : " + getNilai());
        System.out.println("Nilai Huruf : " + getNilaiHuruf());
        System.out.println("Status: " + getStatus());
        
        FileInputStream inputStream;
        
        
        if(getStatus().equalsIgnoreCase("Gagal")) {
            inputStream = new FileInputStream( new File("File_1811081023/Gagal.mp3") );
        } else {
            inputStream = new FileInputStream( new File("File_1811081023/Lulus.mp3") );
        }
        
        BufferedInputStream stream = new BufferedInputStream(inputStream);
        final Player player = new Player(stream);
        
        new  Thread() {
            public void Run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.err.println();
                }
            }
        }.start();
    }
    
    //-----Serialice process----//
    public void saveObject_1811081023(Lat1Modul3_1811081023 mahasiswa) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            
            outputStream.writeObject(mahasiswa);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    //-----Deerialice process----//
    public void readObject_1811081023(Lat1Modul3_1811081023 mahasiswa) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            
            mahasiswa = (Lat1Modul3_1811081023) inputStream.readObject();
            mahasiswa.printData_1811081023();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        Scanner input = new Scanner(System.in);
        Lat1Modul3_1811081023 mahasiswa = new Lat1Modul3_1811081023();
        
        FileInputStream inputStream = new FileInputStream( new File("File_1811081023/audio.mp3") );
        BufferedInputStream stream = new BufferedInputStream(inputStream);
        final Player player = new Player(stream);
        
        System.out.print("Nama : ");
        mahasiswa.setNama(input.nextLine());
        
        System.out.print("NoBP : ");
        mahasiswa.setNobp(input.nextLine());
        
        System.out.print("Matakuliah : ");
        mahasiswa.setMataKuliah(input.nextLine());
        
        System.out.print("Nilai : ");
        mahasiswa.setNilai(input.nextInt());
        
        mahasiswa.saveObject_1811081023(mahasiswa);
        mahasiswa.readObject_1811081023(mahasiswa);
        
        new  Thread() {
            public void Run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.err.println();
                }
            }
        }.start();
    }
}
