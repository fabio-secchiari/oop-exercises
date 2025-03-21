package org.example.strings;


import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String string){
        int count=0;
        StringTokenizer stringTokenizer = new StringTokenizer(string.toLowerCase());
        while(stringTokenizer.hasMoreTokens()){
            String word = stringTokenizer.nextToken();
            if(word.endsWith(String.valueOf('y')) || word.endsWith(String.valueOf('z')))
                count++;
        }
        return count;
    }
}
