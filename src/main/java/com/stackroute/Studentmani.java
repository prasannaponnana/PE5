package com.stackroute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Studentmani {
    public class Manifest {
        public  void main(String args[]) {

            Student s1 = new Student("10", "pavan", 25);
            Student s2 = new Student("23", "srihari", 23);
            Student s3 = new Student("55", "chintu", 13);
            Student s4 = new Student("56", "chintu", 13);
            Student s5 = new Student("78", "chinnu", 11);
            StudentImpgetset s = new StudentImpgetset();
            ArrayList<Student> a = new ArrayList();
            a.add(s1);
            a.add(s2);
            a.add(s3);
            a.add(s4);
            a.add(s5);
            Collections.sort(a, (Comparator<? super Student>) s);
            Iterator i = a.iterator();
            while (i.hasNext()) {
                Student student = (Student) i.next();
                System.out.println(student.getStudentid() + " " + student.getStudentname() + " " + student.getStudentage());

            }
        }}}

