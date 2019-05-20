package com.stackroute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class StudentImpgetset {
    public class StudentImpgrtset implements Comparator {
        public int compare(Object o1, Object o2) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            if (s1.getStudentage() == s2.getStudentage()) {
                int ans = s1.getStudentname().compareTo(s2.getStudentname());
                return ans == 0 ? s1.getStudentid().compareTo(s2.getStudentid()) : ans;
            } else {
                return s1.getStudentage() > s2.getStudentage() ? 1 : 1;
            } }}}
