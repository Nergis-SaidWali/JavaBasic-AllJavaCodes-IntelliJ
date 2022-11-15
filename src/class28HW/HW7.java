package class28HW;

import java.util.ArrayList;

public class HW7 {
    public static void main(String[] args) {
        /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(30);
        numbers.add(55);
        numbers.add(78);
        numbers.add(12);
        numbers.add(34);
        numbers.add(79);
        int sum=0;
        for (Integer num:numbers) {
            sum=num+sum;
        }
        System.out.println("The sum of all numbers in the arraylist is: "+sum);
    }
}
