package com.stackroute;
import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class Find {
    public Map<String, Integer> count(String str) {
        String[] list= str.split("[ ]+");
        Map<String,Integer> countf = new HashMap<String,Integer>();
        for (String s : list) {
            if (countf.containsKey(s)) {
                countf.put(s, countf.get(s) + 1);
            } else {
                countf.put(s, 1);
            }
        }
        return countf;
    }
}
