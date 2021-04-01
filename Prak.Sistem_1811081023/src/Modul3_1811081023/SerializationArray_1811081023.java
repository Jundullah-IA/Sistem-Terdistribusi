/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081023;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author LABSIKOMP03
 */
public class SerializationArray_1811081023 {
    String path = "File_1811081023/SerializationArray_1811081023.txt";
    
    public void seial_1811081023(ArrayList<Participant_1811081023> participants) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
            outputStream.writeObject(participants);
            outputStream.close();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public static void main(String[] args) {
        SerializationArray_1811081023 array = new SerializationArray_1811081023();
        ArrayList<Participant_1811081023> participants = new ArrayList<Participant_1811081023>();
        
        participants.add(new Participant_1811081023("Jundullah ", "Aulia", 20));
        participants.add(new Participant_1811081023("John ", "Doe", 21));
        participants.add(new Participant_1811081023("Jane ", "Doe", 19));
        array.seial_1811081023(participants);
    }
}
