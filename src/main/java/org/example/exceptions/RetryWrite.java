package org.example.exceptions;

import java.io.IOException;
import java.util.random.RandomGenerator;

public class RetryWrite {
    private static final RandomGenerator RND = RandomGenerator.getDefault();

    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Calls the write() method. If it fails, retries the call maxTries times
     * @param maxTries the maximum number of retries
     */
    public static void writeWithTries(int maxTries) {
        for(int i=0; i<maxTries; i++){
            try{
                write("Hello World!");
                return;
            } catch(IOException ignored){}
        }
        throw new RuntimeException("All tries failed!");
    }

    /**
     * Simulates write with 66% probability of failing
     *
     * @param message the message to write
     * @throws IOException when write fails
     */
    public static void write(String message) throws IOException {
        if (RND.nextDouble() < 0.66) {
            throw new IOException("Unable to send: " + message);
        }
    }
}