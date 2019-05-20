package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class FindTest {
        Find f;
        @Before
        public void setUp() throws Exception {
            f=new Find();
        }

        @After
        public void tearDown() throws Exception {
            f=null;
        }
        @Test
        public void findCount(){
            f=new Find();
            String str="one__ two,one two three one one ,two four";
            Map<String,Integer> result=f.count(str);
            Map<String,Integer> c=new HashMap<>();
            c.put("one",4);
            c.put("two",3);
            c.put("three",1);
            c.put("four",1);
            assertEquals(c,result);
        }
        @Test
        public void CountTest(){
            f=new Find();
            String str="1 ? 1.,2";
            Map<String,Integer> result=f.count(str);
            Map<String,Integer> c=new HashMap<>();
            c.put("2",1);
            c.put("1",2);
            assertEquals(c,result);


        }
    }
