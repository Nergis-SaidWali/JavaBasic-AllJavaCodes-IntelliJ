package review12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    //when we want to store more than 1 info inside an array, create a class and store its objects
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Josh", "Plantin", "123"));
        students.add(new Student("Adam", "Park", "123"));
        students.add(new Student("Yusuf", "Engin", "123"));
        students.add(new Student("Cam", "Jo", "123"));

        System.out.println(students);

        for (Student student : students) {
            student.printName();
        }

        Student student = new Student("Josh", "Plantin", "123");
        System.out.println(students.contains(student));
    }
}

