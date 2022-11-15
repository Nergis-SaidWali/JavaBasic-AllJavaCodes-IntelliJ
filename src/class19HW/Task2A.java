package class19HW;

public class Task2A {
    //Write program to inherit class A that has method printF which is static and call or reuse that
    // method into class B
    String name;

    static void printF() {
        System.out.println("This is class A");
    }
}
    class Task2B extends Task2A{
        public static void main(String[] args) {

            Task2B.printF();
        }
    }

