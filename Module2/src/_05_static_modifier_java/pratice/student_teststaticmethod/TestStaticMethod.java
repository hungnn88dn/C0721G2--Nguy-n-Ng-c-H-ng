package _05_static_modifier_java.pratice.student_teststaticmethod;

import _05_static_modifier_java.pratice.student_teststaticmethod.Student;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();


        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
