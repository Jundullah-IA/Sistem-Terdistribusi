/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081023;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author LABSIKOMP03
 */
public class Audio_1811081023 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "File_1811081023/bell.wav";
        
        InputStream stream = new BufferedInputStream( new FileInputStream(path) );
        AudioStream audioStream = new AudioStream(stream);
        System.out.println("Play audio");
        AudioPlayer.player.start(audioStream);
    }
}
