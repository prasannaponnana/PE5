package com.stackroute;

import java.util.Map;

public class Modulereplace {
    public Map<String,String> Replace(Map<String,String> map)
    {
        String value = map.get("value1");
        map.put("value2", value);
        map.put("value1", " ");
        return map;
    }
}
