package class25HW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

    public static void main(String[] args) {
        ArrayList<Integer> evenNums = new ArrayList<>(250);

        for (int i = 2; i <= 500; i += 2) {
            evenNums.add(i);
        }
        System.out.println(evenNums);

        var it=evenNums.iterator();

        while(it.hasNext()){
            Integer num=it.next();
            if(num%5==0){
                it.remove();
            }
        }
        System.out.println(evenNums);
    }
}


