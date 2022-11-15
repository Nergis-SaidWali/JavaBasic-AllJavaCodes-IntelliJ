package class14HW;

import java.util.Scanner;

public class Task1WithVoid {

    void printLarger(int num1, int num2) {
        if(num1>num2) {
            System.out.println("num1 is larger: "+num1);
        }else if (num2>num1) {
            System.out.println("num2 is larger: "+num2);
        }else {
            System.out.println("numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first Number");
        int num1=input.nextInt(); //name can be different we don't have to use the same name as in the void method
        System.out.println("Please enter the second Number");
        int num2=input.nextInt(); // changing name shift+f6
        Task1WithVoid task1=new Task1WithVoid();
        task1.printLarger(num1,num2);
    }
}
