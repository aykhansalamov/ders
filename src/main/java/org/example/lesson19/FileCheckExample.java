package org.example.lesson19;

import java.io.File;

public class FileCheckExample {

    public static void main(String[] args) {

        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
