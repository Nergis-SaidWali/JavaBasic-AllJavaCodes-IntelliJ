package class20HW;

public class Task2 {
    //Create a class named 'Programming'. While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.
}
class Programming{
    String a;
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String a){
        this.a=a;
        System.out.println("I love "+a);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Java");

    }
}
