package Class16;

public class Task2 {
    /*
    * Create a method that will take a String as a parameter and returns reversed String.
    * Method should be available to all classes within your project and accessible by class name.*/

    public String reverse(String a) {
        String str="";
        for(int i=a.length()-1; i>=0; i--) {
            str=str+a.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        System.out.println(obj.reverse("syntax"));
    }
}
