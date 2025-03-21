package org.example;

import lombok.ToString;

@ToString
public class Main {
    public static void main(String[] args){
        Patient patient = new Patient("marco", 22, 70);
        Patient patient2 = new Patient("luisa", 23, 60);
        System.out.println(patient);
        System.out.println(patient2);
    }
}
