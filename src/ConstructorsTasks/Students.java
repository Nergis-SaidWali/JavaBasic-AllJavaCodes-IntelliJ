package ConstructorsTasks;

public class Students {
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students(String newName, int newGrade1, int newGrade2, int newGrade3 ) {
        name=newName;
        grade1=newGrade1;
        grade2=newGrade2;
        grade3=newGrade3;
    }
    void AvarageGrade() {
        System.out.println((name+"'s average grade is "+(grade1+grade2+grade3)/3));
    }

    public static void main(String[] args) {
        Students obj=new Students("Yusuf", 90, 75, 88);
        obj.AvarageGrade();
        Students obj2=new Students("Hamza", 100, 82, 70);
        obj2.AvarageGrade();
        Students obj3=new Students("Alias", 78, 50, 62);
        obj3.AvarageGrade();
    }
}
