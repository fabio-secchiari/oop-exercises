package org.example.oop.reverse;

public class ReverserFast implements Reverser{
    @Override
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
