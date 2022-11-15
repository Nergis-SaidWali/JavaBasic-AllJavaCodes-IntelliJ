package class20HW;

public class Task3 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
}
class Overloaded{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(Overloaded.add(5,8));
        System.out.println(Overloaded.add(7,4,9));
        System.out.println(Overloaded.add(5.5,8.5));

    }
}