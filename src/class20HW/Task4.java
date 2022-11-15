package class20HW;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
}
class PrivateOverloaded{
    private int multiply(int a, int b){
        return a*b;
    }
    private int multiply(int a, int b, int c){
        return a*b*c;
    }
    private double multiply(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        PrivateOverloaded obj=new PrivateOverloaded();
        System.out.println(obj.multiply(5,8));
        System.out.println(obj.multiply(5,8,9));
        System.out.println(obj.multiply(5.5,8.5));
    }
}
class Test{
    public static void main(String[] args) {
        PrivateOverloaded obj=new PrivateOverloaded();
        //System.out.println(obj.multiply(5,8)); //cannot be accesed to the private method outside of the class
    }
}

