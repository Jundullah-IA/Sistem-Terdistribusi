/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author LABSIKOMP03
 */
public class AudioMP3_1811081023 {
    private static Player player;
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        String path = "File_1811081023/audio.mp3";
        
        FileInputStream inputStream = new FileInputStream( new File(path) );
        BufferedInputStream stream = new BufferedInputStream(inputStream);
        
        player = new Player(stream);
        
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
