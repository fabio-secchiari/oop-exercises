package org.example.arrays;

import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
        for (String string : strings) {
            if (string.equals(searched)) return true;
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched){
        String[] strs = CopyArray.copyArray(strings);
        Arrays.sort(strs);
        return Arrays.binarySearch(strs, searched) >= 0;
    }
}
