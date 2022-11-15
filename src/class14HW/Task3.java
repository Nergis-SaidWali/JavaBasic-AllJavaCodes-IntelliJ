package class14HW;


    public class Task3 {
        /*Create a method that will print whether given String is palindrome or not.*/

        boolean palindrome(String word) {
            StringBuilder w = new StringBuilder(word);

            if(word.equalsIgnoreCase(w.reverse().toString())) {
                return true;
            } else {
                return false;
            }
        }


        public static void main(String[] args) {
            class14HW.Task3 pl = new class14HW.Task3();
            String a = "Nergis";

            if (pl.palindrome(a)) {
                System.out.println("it is a palindrome");
            } else {
                System.out.println("it is not a palindrome");
            }
        }
    }


