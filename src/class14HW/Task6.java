package class14HW;

public class Task6 {
    /*Write a method to return whether given number is prime or not?*/

   void Prime(int num) {

       if (num > 1) {
           for (int i = 2; i < num; i++) {
               if (num % i == 0) {
                   System.out.println("This number is not a prime number");
                   break;
               } else {
                   System.out.println("This number is a prime number");
                   break;
               }

           }
       }
   }
    public static void main(String[] args) {
        Task6 primeNum=new Task6();
        primeNum.Prime(7);
    }

}
