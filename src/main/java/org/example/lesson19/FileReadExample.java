package org.example.lesson19;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));

            String line;
            while ((line = reader.readLine()) !=null ) {
                System.out.println("Oxunan setir: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Xeta bash verdi: " + e.getMessage());
        }

    }
}
