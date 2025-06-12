package org.example.exceptions;

import java.io.*;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            return reader.readLine();
        }
    }
}
