package class14HW;

public class Task1 {
    /*Create a method that will take 2 parameters as a numbers and prints which number is larger.*/

    boolean larger(int num1, int num2) {
        if (num1 > num2) {
            return true;
        } else {
            return false;
        }
    }

        public static void main(String[] args) {
        Task1 largeNum = new Task1();

            if (largeNum.larger(5, 9)) {
            System.out.println(5 + " is larger than " + 9);
        } else {
            System.out.println(9 + " is larger than " + 5);
        }
    }
}
