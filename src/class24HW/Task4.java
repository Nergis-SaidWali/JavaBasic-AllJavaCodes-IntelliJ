package class24HW;

import java.util.ArrayList;

public class Task4 {
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(25);
        numbers.add(54);
        numbers.add(100);
        numbers.add(75);
        numbers.add(123);
        System.out.println(numbers.size());
        System.out.println("*********************************");
        for(int i=0; i<numbers.size(); i++){
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println("");
        for(Integer num:numbers){
            System.out.print(num+" ");
        }
    }
}
