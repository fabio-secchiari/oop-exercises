package org.example.strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string){
        int foundNot=string.indexOf("not"), foundIs=string.indexOf("is");
        while(foundNot >= 0 && foundIs >= 0){
            foundNot = string.indexOf("not", foundNot + 3);
            foundIs = string.indexOf("is", foundIs + 2);
        }
        return foundIs == foundNot; // se sono uguali significa che sono entrambi -1 per cui bilanciati
    }
}
