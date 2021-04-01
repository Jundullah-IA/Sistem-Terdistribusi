/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author LABSIKOMP03
 */
public class Participant_1811081023 implements Serializable {
    String firstName, lastName;
    int age;
    String path = "File_1811081023/Object_1811081023.txt";

    public Participant_1811081023(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private Participant_1811081023() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void printData_1811081023() {
        System.out.println("Nama : " + firstName + lastName);
        System.out.println("Umur : " + age);
    }
    
    //-----Serialice process----//
    public void saveObject_1811081023(Participant_1811081023 participant) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            
            outputStream.writeObject(participant);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    //-----Deerialice process----//
    public void readObject_1811081023(Participant_1811081023 participant) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            
            participant = (Participant_1811081023) inputStream.readObject();
            participant.printData_1811081023();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public static void main(String[] args) {
//        Participant_1811081023 participant = new Participant_1811081023("Jundullah ", "Aulia", 20);
//        
//        participant.saveObject_1811081023(participant);
//        participant.readObject_1811081023(participant);
        
        Participant_1811081023 participant = new Participant_1811081023();
        
        participant.setFirstName("Jundullah ");
        participant.setLastName("Aulia");
        participant.setAge(20);
        
        participant.saveObject_1811081023(participant);
        participant.readObject_1811081023(participant);
    }
}
