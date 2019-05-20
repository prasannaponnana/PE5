package com.stackroute;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;
public class Reolaceboolean {
    public Map<String,Boolean> map(String[] str) {
            Map<String, Boolean> boo = new HashMap<>();
            for (String word : str) {
                if (boo.containsKey(word)) {
                    boo.put(word, true);
                } else {
                    boo.put(word, false);
                }
            }
            return boo;
        }
    }








