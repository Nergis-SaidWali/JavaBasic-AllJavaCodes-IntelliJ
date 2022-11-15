package review13;

import java.lang.reflect.Array;
import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        //I want a method that takes a map and returns an arraylist containing all the keys from that map.

        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        List<String> keys=getKeys(items);
        for (var key:keys
        ) {
            System.out.println(key);
        }
        List<Double> values=getValues(items);
        for (var value:values
             ) {
            System.out.println(value);
        }

    }
    public static List<String> getKeys(Map<String, Double> map){
        return new ArrayList<>(map.keySet());
    }
    public static List<Double> getValues(Map<String, Double> map){
        return new ArrayList<>(map.values());
    }

}
