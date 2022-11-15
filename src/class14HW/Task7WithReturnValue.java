package class14HW;

public class Task7WithReturnValue {

    char getGrade(int score) {
        char grade;
        if(score>90){
            grade='A';
        }else if(score>80) {
            grade='B';
        }else if(score>70) {
            grade='C';
        }else if(score>50) {
            grade='D';
        }else {
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task7WithReturnValue task7=new Task7WithReturnValue();
        System.out.println(task7.getGrade(80));
    }
}
