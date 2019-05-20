package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import static org.junit.Assert.*;

public class RandomOrderText {

    RandomOrder Rot=new RandomOrder();

    @Test
    public void randomOrder(){

        SortedSet<String> ob=new TreeSet<String>();
        ob.add("harry");
        ob.add("olive");
        ob.add("alice");
        ob.add("bluto");
        ob.add("eugene");
        ArrayList<String> result=Rot.randomString(ob);
        System.out.println(result);
        ArrayList<String> rot=new ArrayList<>();
        rot.add("alice");
        rot.add("bluto");
        rot.add("eugene");
        rot.add("harry");
        rot.add("olive");
        assertEquals(rot,result);
    }

}

