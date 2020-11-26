package com.academy.lessons12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteJava {
    public static void main(String[] args) {
        Properties prop = new Properties();
        File file = new File("java-part.properties");

        try(FileInputStream fis = new FileInputStream(file)) {
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
