package com.stackroute;

import java.util.HashMap;
import java.util.Map;
public class Reolaceboolean {
 public Map<String,Boolean> Map(String[] s) {
            Map<String, Boolean> boo = new HashMap<>();
            for (String p : s) {
                if (boo.containsKey(p)) {
                    boo.put(p, true);
                } else {
                    boo.put(p, false);
                }
            }
            return boo;
        }
    }








