package Class16;

public class Task1 {

    /*
    * Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    * Method should be visible only within same package and accessible by the creating an instance of the class. */

    static int sum(int[] a) {
        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum=sum+a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        int [] arr= {34, 67, 9, 15};
        System.out.println(sum(arr));
    }



}
