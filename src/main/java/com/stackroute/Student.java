package com.stackroute;
public class Student {
        public String studentid;
        public String studentname;
        public int studentage;
        public Student(String studentid, String studentname, int studentage) {
            this.studentid = studentid;
            this.studentname = studentname;
            this.studentage = studentage;
        }
        public String getStudentid() {
            return studentid;
        }
        public String getStudentname() {
            return studentname;
        }
        public int getStudentage() {
            return studentage;
        }
        public void setStudentid(String studentid) {
            this.studentid = studentid;
        }
        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }
        public void setStudentage(int studentage) {
            this.studentage = studentage;
        }
    }









