package com.stackroute;
import java.util.List;
public class Replace {
        public List<String> replace(List<String> list){
            list.set(0,"kiwi");
            list.set(2,"mango");
            return list;
        }
        public String clearArrayList(List<String> list){
            list.clear();
            String result="";
            if(list.isEmpty())
            {
                res="true";
            }
            else
                res="false";
            return res;

        }
    }



