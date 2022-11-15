package class26HW;

import java.util.HashSet;

public class Task6 {
    /*Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.*/
    public static void main(String[] args) {

        HashSet<Student> studentTypes=new HashSet<>();
        studentTypes.add(new Student("Yusuf", "3490231"));
        studentTypes.add(new Student("Hamza", "7865201"));
        studentTypes.add(new Student("Alias", "76402719"));

        System.out.println(studentTypes);


    }
}
class Student{
    String name;
    String studentID;
    Student(String name, String studentID){
        this.name=name;
        this.studentID=studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
