package class19HW;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Asel", "Umurzakova", "Java");
        teacher.printInfo();
        MathTeacher obj=new MathTeacher("Nurtekin", "Kitapsiz", "Math");
        obj.printInfo();
        ChemistryTeacher obj2=new ChemistryTeacher("James", "Neel", "Chemistry", 80000);
        obj2.ChemistryTeacher();
        PianoTeacher obj3=new PianoTeacher("Brooklyn", "Wright", "Music", 10);
        obj3.PianoTeacher();


    }
}
