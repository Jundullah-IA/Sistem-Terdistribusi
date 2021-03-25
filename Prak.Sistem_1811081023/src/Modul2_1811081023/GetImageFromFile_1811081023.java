/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LABSIKOMP03
 */
public class GetImageFromFile_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pet1811081023 = "File_1811081023/ImageFile_1811081023.txt";
        BufferedReader br = new BufferedReader( new FileReader(pet1811081023) );

        String line = null;
        String namaGambar = null, judulGambar = null;
        
        while ( (line = br.readLine()) != null) {
            String[] konfigurasi = line.split("@");

            namaGambar = konfigurasi[0];
            System.out.println("Nama gambar : + namaGambar");
            
            judulGambar = konfigurasi[1];
            System.out.println("Judul Gambar : " + judulGambar);
        } br.close();
        
        String path = "File_1811081023/" + namaGambar;
        File file = new File(path);
        
        InputStream stream = new BufferedInputStream( new FileInputStream(file) );
        Image image = ImageIO.read(stream);
        
        JFrame frame = new JFrame(judulGambar);
        JLabel label = new JLabel( new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
