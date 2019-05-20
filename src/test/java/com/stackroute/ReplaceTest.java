package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

    public class ReplaceTest{
        Replace rtest;
        @Before
        public void setUp() throws Exception {
            rtest=new Replace();
        }

        @After
        public void tearDown() throws Exception {
            rtest=null;
        }
        @Test
        public void replaceElement()
        {
            rtest=new Replace();
            List<String> f=new ArrayList<String>();
            f.add("apple");
            f.add("grape");
            f.add("melon");
            f.add("berry");
            List<String> f1=rtest.replace(f);
            List<String> f2=new ArrayList<>();
            f2.add("kiwi");
            f2.add("grape");
            f2.add("mango");
            f2.add("berry");
            assertEquals(f2,f1);

        }
        @Test
        public void emptyArrayList()
        {
            rtest=new Replace();
            List<String> f=new ArrayList<String>();
            f.add("kiwi");
            f.add("grape");
            f.add("mango");
            f.add("berry");
            String s1=rtest.clearArrayList(f);
            assertEquals("true","true");

        }
    }
