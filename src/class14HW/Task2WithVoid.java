package class14HW;

public class Task2WithVoid {
    void printEvenOdd(int number) {
        if(number%2==0) {
            System.out.println(number+" is Even");
        } else {
            System.out.println(number+ " is Odd");
        }
    }

    public static void main(String[] args) {
        Task2WithVoid task=new Task2WithVoid();
        task.printEvenOdd(45);
    }
}
