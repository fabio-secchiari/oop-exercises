package org.example.strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String input){
        StringBuilder seen = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            String tmp = String.valueOf(input.charAt(i));
            if (!seen.toString().contains(tmp)) { // prima volta che la vedo
                seen.append(tmp);
            } else if (!duplicates.toString().contains(tmp)) { // è un doppione
                duplicates.append(tmp);
            }
        }
        char[] res = duplicates.toString().toCharArray();
        Arrays.sort(res);
        return res;
    }
}
