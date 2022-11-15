package class19HW;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String name;
    String lastName;
    String subject;
    int age;
    int totalExperience;
    double salary;
    char gender;

    public static void canTeach() {
        System.out.println("Teachers teach");
    }
    public static void giveGrade() {
        System.out.println("Teachers grade students' exam paper.");
    }
    public Teacher(String name, String lastName, String subject){
        this.name=name;
        this.lastName=lastName;
        this.subject=subject;
    }
    void printInfo() {
        System.out.println("Teacher's name and lastname is "+name+" "+lastName+" and "+name+" "+lastName+" teaches "+subject);
    }
}
class MathTeacher extends Teacher{
    public MathTeacher(String name, String lastName, String subject){

        super(name, lastName, subject);
    }


}
class ChemistryTeacher extends Teacher{
    double salary;
    public ChemistryTeacher(String name, String lastName, String subject, double salary) {
        super(name, lastName, subject);
        this.salary=salary;
    }
    public void ChemistryTeacher(){
        System.out.println("Teacher's name and lastname is "+name+" "+lastName+" and "+name+" "+lastName+" teaches "+subject+" and the salary is "+salary);
    }
}
class PianoTeacher extends Teacher{
    int yearOfExperience;
    public PianoTeacher(String name, String lastName, String subject, int yearOfExperience) {
        super(name, lastName, subject);
        this.yearOfExperience=yearOfExperience;
    }
    public void PianoTeacher(){
        System.out.println("Teacher's name and lastname is "+name+" "+lastName+" and "+name+" "+lastName+" teaches "+subject+" and the year of experience "+yearOfExperience);
    }

}
