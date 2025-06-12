package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n){
        if(n < 1) return new ArrayList<>();
        List<Long> ret = new ArrayList<>();
        ret.add(n);
        while(n != 1){
            if(n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            ret.add(n);
        }
        return ret;
    }
}
