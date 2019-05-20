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
            Map<String,String> rp=new HashMap<String,String>();
            rp.put("value1","val3");
            rp.put("value2","val6");
            Map<String, String> res=modulereplace.Replace(rp);
            Map<String,String> rpresult=new HashMap<String,String>();
            rpresult.put("value1"," ");
            rpresult.put("value2","val3");
            assertEquals(rpresult,res);



        }
    }
