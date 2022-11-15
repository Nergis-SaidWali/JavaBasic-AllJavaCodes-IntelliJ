package class22;

public class Parent {
    static void print(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    static void print(){
        System.out.println("Hello There");
    }   // static method cannot be overridden but re-declared
}
class Test{
    public static void main(String[] args) {
        Child.print();
    }
}
