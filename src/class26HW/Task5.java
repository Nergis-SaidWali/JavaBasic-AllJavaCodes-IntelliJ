package class26HW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Task5 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;*/

    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Ankara");
        cities.add("Lahore");
        cities.add("Riyadh");
        cities.add("Adana");
        cities.add("Londan");
        cities.add("Mekkah");
        cities.add("Amsterdam");

        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
            String item= iterator.next();
            if(item.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
