package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

    public class ModulereplaceTest {
        Modulereplace modulereplace;
        @Before
        public void setUp() throws Exception {
            modulereplace=new Modulereplace();
        }

        @After
        public void tearDown() throws Exception {
            modulereplace=null;
        }
        @Test
        public void module(){
            modulereplace=new Modulereplace();
            Map<String,String> map=new HashMap<String,String>();
            map.put("value1","val3");
            map.put("value2","val6");
            Map<String,String> resultmap=modulereplace.Replace(map);
            Map<String,String> mapresult=new HashMap<String,String>();
            mapresult.put("value1"," ");
            mapresult.put("value2","val3");
            assertEquals(mapresult,resultmap);



        }
    }
