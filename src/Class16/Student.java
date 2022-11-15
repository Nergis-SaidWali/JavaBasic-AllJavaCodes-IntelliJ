package Class16;

public class Student {

    /*
   Create a Class called students
   create three variable name, id, and numberOfStudents
   create three objects of the student class
   set the value for studentName, studentID, and increment the numberOfStudents for each object
   print out total number of students.
    */
    String name;
    String id;
    static int numberOfStudents;
    public static void main(String[] args) {
        Student roman=new Student();
        roman.id="1";
        roman.name="Roman";
        Student.numberOfStudents++;

        Student sonamKapoor=new Student();
        sonamKapoor.id="2";
        sonamKapoor.name="Sonam";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);



    }

}
