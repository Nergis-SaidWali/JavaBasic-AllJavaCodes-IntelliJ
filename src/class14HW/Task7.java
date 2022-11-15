package class14HW;

public class Task7 {
    /*Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/

    void getGrade(int score) {
    if(score>90 && score<=100) {
        System.out.println("A");
    }else if(score>80 && score<=90) {
        System.out.println("B");
    }else if(score>70 && score<=80) {
        System.out.println("C");
    }else if(score>50 && score<=70) {
        System.out.println("D");
    }else if(score>0 && score<=50) {
        System.out.println("F");
    }else {
        System.out.println("Incorrect input");
    }
    }

    public static void main(String[] args) {
        Task7 grade=new Task7();
        grade.getGrade(87);
    }
}

