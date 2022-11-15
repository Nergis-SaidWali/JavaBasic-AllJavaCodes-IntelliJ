package class26HW;

import java.util.TreeSet;

public class Task4 {
    /*Create a Set collection in which you need to add names of the countries.
     In this set we want all objects to be sorted in alphabetical order.
     Using 2 different ways retrieve all elements from set.   */

    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Turkiye");
        countries.add("Uzbekistan");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Palestine");
        countries.add("East Turkistan");
        countries.add("Ukraine");

        for(int i=0; i< countries.size(); i++){
            countries.toString();
        }
        System.out.println(countries);

        for(var country:countries){
            System.out.print(country+", ");
        }
    }
}