package review2;

public class Teacher {

    String name, lastName;
    int experience;
    String subject;
    double salary;

    static String school;
    //constructor is a block of code which is executed when we create and object
    /*
    * how to create a constructor
    * 1. constructor name=classname
    * 2. no return type not even void
    * 3.when we do not create a constructor, compiler creates it for us*/

    //using below constructor we initialize instance variables
    Teacher(String fName, String lName) {
        name=fName;
        lastName=lName;
    }
}
