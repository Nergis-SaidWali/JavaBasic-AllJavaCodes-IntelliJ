package class22;

public class class22HW {
    /*SyntaxStudent obj=new SyntaxStudent();
           obj.study();
           obj.read();
           obj.preparingInterview();
           CollegeStudent obj2=new CollegeStudent();
           obj2.study();
           obj2.read();
           obj2.prepareForExams();
           SchoolStudent obj3=new SchoolStudent();
           obj3.study();
           obj3.read();
           obj3.prepareForTests();
       } */
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student a : students) {
            a.study();
            a.read();
        }
    }
}
class Student{
    void study(){
        System.out.println("I can study");
    }
    void read(){
        System.out.println("I can read");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("I can study Java");
    }

    @Override
    void read() {
        System.out.println("I can read codes");
    }
    void preparingInterview(){
        System.out.println("I get prepared for interviews");
    }
}
class CollegeStudent extends Student{
    @Override
    void study() {
        System.out.println("I can study Math");
    }

    @Override
    void read() {
        System.out.println("I can read novels");
    }
    void prepareForExams(){
        System.out.println("I'm getting prepared for exams");
    }
}
class SchoolStudent extends Student {
    @Override
    void study() {
        System.out.println("I can study English");
    }

    @Override
    void read() {
        System.out.println("I can read books");
    }

    void prepareForTests() {
        System.out.println("I'm getting prepared for tests");
    }
}

