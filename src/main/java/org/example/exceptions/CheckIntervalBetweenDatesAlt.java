package org.example.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try {
            return LocalDate.parse(begin).isBefore(LocalDate.parse(end));
        } catch(DateTimeParseException e){
            return false;
        }
    }
}
