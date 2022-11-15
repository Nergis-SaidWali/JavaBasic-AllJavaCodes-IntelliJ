package Class16;

public class Task3 {
    /*
    * Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    *  Method should be available inside the class only where it was declared and executed by calling it is name.
    * */
    private String vowelsOnly(String a) {
        a=a.replaceAll("[^aeiou]", "");
        return a;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        System.out.println(obj.vowelsOnly("umbrella"));
    }
}
