package class14HW;

public class Task2 {
    /*Create a method that will take a number and prints whether the number is even or odd.*/

    Boolean isEven(int num) {

        if(num%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Task2 even=new Task2();

        if(even.isEven(5)) {
            System.out.println(5+ " is even");
        } else {
            System.out.println(5+ " is odd");
        }
    }
}
