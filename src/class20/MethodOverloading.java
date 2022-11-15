package class20;

public class MethodOverloading {
    static void addInt(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void addDoubles(double num1, double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        //addInt(10.5, 50.5)
    }
}
