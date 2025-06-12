package org.example.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> alternatingList = new ArrayList<>();
        for(List<String> list : lists){
            try {
                for (String string : list) {
                    CheckString.checkString(string);
                }
                alternatingList.add(list);
            } catch(ParseException ignored){}
        }
        return alternatingList;
    }
}
