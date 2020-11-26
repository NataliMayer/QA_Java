package com.academy.lessons11;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) {
        String path = "/Users/nataliiatereshchuk/Desktop/Maven/file.pages";

        try (Scanner scanner = new Scanner(new FileInputStream(path))){
            PrintWriter writer = new PrintWriter(new FileWriter(path));
            writer.println("Hello World");
            writer.println("row2");
            writer.println("row3");
            writer.println("row4");
            writer.flush();// Нужно вызват в конце, для того, чтобы из буфера записать накопленную порцию данных в файл
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
