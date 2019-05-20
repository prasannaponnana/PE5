package com.stackroute;
public class Student {
        public String student_id;
        public String student_name;
        public int student_age;
        public Student(String student_id, String student_name, int student_age) {
            this.student_id = student_id;
            this.student_name = student_name;
            this.student_age = student_age;
        }
        public String getStudentid() {
            return student_id;
        }
        public String getStudentname() {
            return student_name;
        }
        public int getStudentage() {
            return student_age;
        }
        public void setStudentid(String student_id) {
            this.student_id = student_id;
        }
        public void setStudentname(String student_name) {
            this.student_name = student_name;
        }
        public void setStudentage(int student_age) {
            this.student_age = student_age;
        }
    }









