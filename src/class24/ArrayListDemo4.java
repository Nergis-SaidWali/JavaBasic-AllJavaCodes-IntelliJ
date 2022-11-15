package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("TYmur");
        names.add("Salma");
        names.add("Hamza");
        names.add("Josh");
        names.add(0, "Yusuf");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.set(0, 12000); //replaces values on those indexes
        System.out.println(numbers);
        numbers.clear(); //deletes all the elements from the list
    }
}
