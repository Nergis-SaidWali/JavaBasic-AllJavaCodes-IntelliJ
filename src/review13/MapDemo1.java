package review13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //I want a method that takes a map and returns a set containing all the keys from that map.

        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        Set<String> keys=getKeys(items);
        for (var key:keys
             ) {
            System.out.println(key);
        }
    }
    public static Set<String> getKeys(Map<String, Double> map){
        return map.keySet();
    }
}
