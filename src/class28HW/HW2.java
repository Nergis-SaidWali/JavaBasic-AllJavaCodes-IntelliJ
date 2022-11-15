package class28HW;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("Turkiye", "Ankara");
        countries.put("USA", "New York");
        countries.put("Saudi Arabia", "Riyadh");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Pakistan", "Islamabad");
        countries.put("England", "London");

        System.out.println("All the keys and values from the map using for each loop");
        Set<Map.Entry<String, String>> entrySet=countries.entrySet();
        for (Map.Entry<String, String> entry:entrySet) {
            System.out.println(entry.getKey()+ "-" +entry.getValue());
        }
        
        System.out.println("All the keys and values from the map using iterator");
        Iterator<Map.Entry<String, String>> iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            System.out.println(m.getKey()+ "-" +m.getValue());
        }

        System.out.println("All the values using for each loop");
        Collection<String> values=countries.values();
        for (String value:values) {
            System.out.print(value+", ");
        }
        System.out.println("");
        System.out.println("All the values using iterator");
        Iterator<String> iterator1=countries.values().iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+", ");
        }
        
    }
}
