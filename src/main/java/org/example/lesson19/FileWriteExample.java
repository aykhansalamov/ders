package org.example.lesson19;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Salam, Java fayla yazildi!");
            writer.close();
            System.out.println("Yazildi.");


        } catch (IOException e) {
            System.out.println("Xeta bash verdi: " + e.getMessage());
        }
    }
}
