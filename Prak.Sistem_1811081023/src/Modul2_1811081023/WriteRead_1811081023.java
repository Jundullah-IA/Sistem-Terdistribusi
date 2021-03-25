package Modul2_1811081023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteRead_1811081023 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String userInput;
        Scanner input = new Scanner(System.in);
        String pet1811081023 = "File_1811081023/LatWriteRead_1811081023.dat";

        System.out.println("Menu :");
        System.out.println("-------------------------\n");
        System.out.println("1 - Write File");
        System.out.println("2 - Read File");

        System.out.print("Please input your selection : ");
        int selectA = input.nextInt();
        System.out.println("User choice : " + selectA + "\n");
        
        switch(selectA) {
            case 1 : {
                System.out.println("Menu :");
                System.out.println("-------------------------\n");
                System.out.println("1 - Write using Stream");
                System.out.println("2 - Write using Buffer Writer");

                System.out.print("Please input your selection : ");
                int selectB = input.nextInt();
                System.out.println("User choice : " + selectB + "\n");
                
                System.out.print("Input text to write : ");
                userInput = input.nextLine();
                userInput = input.nextLine();
                
                switch(selectB) {
                    case 1 : {
                        OutputStream outputStream = new FileOutputStream(pet1811081023);
                        
                        for (int i = 0; i < userInput.length(); i++) {
                            outputStream.write((byte) userInput.charAt(i));
                        } outputStream.close();

                        System.out.println("Output stream closed . . .");
                    } break;
                        
                    case 2 : {
                        File file = new File(pet1811081023);
                        FileWriter writer = new FileWriter(file);
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);
                        
                        bufferedWriter.write(userInput);
                        bufferedWriter.close();
                    } break;
                }
            } break;
                
            case 2 : {
                System.out.println("Menu :");
                System.out.println("-------------------------\n");
                System.out.println("1 - Read using Stream");
                System.out.println("2 - Read using Buffer Reader");

                System.out.print("Please input your selection : ");
                int selectB = input.nextInt();
                System.out.println("User choice : " + selectB + "\n");
                
                System.out.println("File content :\n");
                switch(selectB) {
                    case 1 : {
                        InputStream file1811081023 = new FileInputStream(pet1811081023);
                        int data1811081023 = file1811081023.read();

                        while (data1811081023 != -1) {            
                            System.out.print((char) data1811081023);
                            data1811081023 = file1811081023.read();
                        } file1811081023.close();
                    } break;
                        
                    case 2 : {
                        BufferedReader br = new BufferedReader( 
                            new FileReader(pet1811081023));
                        
                        String line = null;
                        while ( (line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                    } break;
                }
            } break;
        }
    }
}
