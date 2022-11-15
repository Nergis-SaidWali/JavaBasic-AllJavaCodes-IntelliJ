package class20;

public class MethodOverLoadingDemo {
    static void F1(String name, int number){
        System.out.println("1");
    }
    //by changing the number of parameters
    static void F1(String name, int number, int number2){
        System.out.println("2");
    }
    //by changing the data types
    static void F1(int num1, int number){
        System.out.println("3");
    }
    //by changing the order of parameters
    static void F1(int number, String name){
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo md=new MethodOverLoadingDemo();
        md.F1("Taras",20);
    }
}

