package org.example.lesson19;

import java.io.File;

public class FileDeleteExample {

    public static void main(String[] args) {

        File file = new File("example.txt");

        if(file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }
}
