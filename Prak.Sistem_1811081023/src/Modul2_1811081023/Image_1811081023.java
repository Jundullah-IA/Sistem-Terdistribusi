/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Image_1811081023 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "File_1811081023/WALPAPER_TI.jpg";
        File file = new File(path);
        
        InputStream stream = new BufferedInputStream( new FileInputStream(file) );
        Image image = ImageIO.read(stream);
        
        JFrame frame = new JFrame("Image");
        JLabel label = new JLabel( new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        
    }
}
