package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static List<Long> lookAndSay(long n){
        if(n<1) return new ArrayList<>();
        List<Long> list = new ArrayList<>(List.of(1L));
        StringBuilder newNumber = new StringBuilder();
        int cur = 0;
        while(list.size() != n){
            newNumber.setLength(0);
            String oldNum = list.get(cur).toString();
            boolean firstRound = true;
            char lastChar = 0;
            int count = 0;
            for(int i=0; i<oldNum.length(); i++){
                if(firstRound){
                    lastChar = oldNum.charAt(i);
                    count = 1;
                    firstRound = false;
                } else {
                    if(lastChar == oldNum.charAt(i)){
                        count += 1;
                    } else {
                        newNumber.append(count).append(lastChar);
                        lastChar = oldNum.charAt(i);
                        count = 1;
                    }
                }
            }
            newNumber.append(count).append(lastChar);
            list.add(Long.parseLong(newNumber.toString()));
            cur += 1;
        }
        return list;
    }
}
