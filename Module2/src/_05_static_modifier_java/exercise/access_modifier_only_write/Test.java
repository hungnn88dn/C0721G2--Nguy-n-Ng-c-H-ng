package _05_static_modifier_java.exercise.access_modifier_only_write;

public class Test {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Tom");
        student.setClasses("C03");
        System.out.println(student.toString());
    }
}
