package _05_static_modifier_java.exercise.access_modifier_only_write;

 class Student {
    private String name= "John";
    private String classes= "C02";
    Student() {

    }

     public void setName(String name) {
         this.name = name;
     }

     public void setClasses(String classes) {
         this.classes = classes;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", classes='" + classes + '\'' +
                 '}';
     }
 }
