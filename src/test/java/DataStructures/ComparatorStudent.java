package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorStudent {

    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(1,20));
        stud.add(new Student(2,40));
        stud.add(new Student(3,60));
        stud.add(new Student(4,80));

        Collections.sort(stud,(o1,o2) -> {
           return o1.marks>o2.marks?-1:o1.marks<o2.marks?1:0;
        });

        for(Student s : stud) {
            System.out.println(s);
        }
    }

public static class Student {
        int rollNo;
        int marks;
        public Student(int rollNo, int marks) {
            this.rollNo = rollNo;
            this.marks = marks;
        }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
    }
}
