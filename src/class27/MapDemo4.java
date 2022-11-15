package class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99);// to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);
        fruit.put("Banana", 12.0);
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

        Set<String> keyset=fruit.keySet();
        System.out.println(keyset);
        var values=fruit.values();
        System.out.println(values);
    }
}
