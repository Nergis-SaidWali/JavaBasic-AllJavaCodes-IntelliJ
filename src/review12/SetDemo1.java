package review12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        //we want to sort and remove duplicates from an ArrayList
        numbers.add(1500000);
        numbers.add(1200000);
        numbers.add(1300000);
        numbers.add(1400000);
        numbers.add(1400000);
        Set<Integer> set=new TreeSet<>(numbers); //converts the ArrayList to TreeSet
        System.out.println(set);
        /*   numbers.clear();
      numbers.addAll(set);*/
        ArrayList<Integer> numbers2=new ArrayList<>(set);
        System.out.println(numbers2);

    }
}
