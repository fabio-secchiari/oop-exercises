package org.example.oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String str){
        char[] nuova = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            nuova[str.length() - 1 - i] = str.charAt(i);
        }
        return String.valueOf(nuova);
    }
}
