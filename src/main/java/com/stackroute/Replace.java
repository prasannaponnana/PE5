package com.stackroute;
import java.util.List;
public class Replace {
        public List<String> replace(List<String> list){
            list.set(0,"apple");
            list.set(2,"mango");
            return list;
        }
        public String clearArrayList(List<String> list){
            list.clear();
            String result="";
            if(list.isEmpty())
            {
                result="true";
            }
            else
                result="false";
            return result;

        }
    }



