package org.example.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence){
        if(licence.length() != 7) throw new IllegalArgumentException("License plate length not 7");
        if(licence.substring(0, 2).chars().anyMatch(c -> !Character.isLetter(c))){
            throw new IllegalArgumentException("Illegal format in license plate");
        }
        if(licence.substring(2, 5).chars().anyMatch(c -> !Character.isDigit(c))){
            throw new IllegalArgumentException("Illegal format in license plate");
        }
        if(licence.substring(5, 7).chars().anyMatch(c -> !Character.isLetter(c))){
            throw new IllegalArgumentException("Illegal format in license plate");
        }
    }
}
