package DataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student(10,20));
        ls.add(new Student(11,40));

        Collections.sort(ls);

        for(Student s : ls) {
            System.out.println(s);
        }
    }

    public static class Student implements Comparable<Student>{
        int rollno;
        int marks;
        public Student(int rollno, int marks) {
            this.rollno = rollno;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", marks=" + marks +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
//          return this.marks>o.marks?-1:this.marks<o.marks?1:0;
            return this.marks>o.marks?-1:1;
        }
    }
}
