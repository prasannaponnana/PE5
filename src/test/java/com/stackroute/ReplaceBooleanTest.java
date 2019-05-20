package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceBooleanTest {
    Reolaceboolean rb;
    @Before
    public void setUp() throws Exception {
        rb=new Reolaceboolean();
    }
    @After
    public void tearDown() throws Exception {
        rb=null;
    }
    @Test
    public void replace(){
        rb=new Reolaceboolean();
        String[] arr={"a","b","b","a","a","c","c","d","d"};
        Map<String,Boolean> res=rb.map(a);
        Map<String,Boolean> res1=new HashMap<String,Boolean>();
        res1.put("a",true);
        res1.put("b",true);
        res1.put("c",true);
        res1.put("d",true);
        assertEquals(res1,res);
    }
    @Test
    public void GivenStringArray_SameItemsAreAlsoSent_ShouldReturnTrueOrFalseCorresponding() {
        rb = new Reolaceboolean();
        String[] s = {"one", "two","three", "one", "two"};
        Map<String,Boolean> res= rb.map(s);
        Map<String,Boolean> res2=new HashMap<String,Boolean>();
        res2.put("one",true);
        res2.put("two",true);
        res2.put("three",false);
        assertEquals(res2,res);
    }

}


