package class14HW;

public class Task3WithVoid {
    /*Create a method that will print whether given String is palindrome or not.*/

    void printPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }
    }

    public static void main(String[] args) {
        Task3WithVoid task=new Task3WithVoid();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
        task.printPalindrome("race car");
    }

}
