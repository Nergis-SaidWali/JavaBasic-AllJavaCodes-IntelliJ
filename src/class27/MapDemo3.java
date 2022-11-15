package class27;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> beautyProducts = new HashMap<>();
        beautyProducts.put("Foundation", 50.5);
        beautyProducts.put("Blush", 20.0);
        beautyProducts.put("Lipstick", 10.5);

        HashMap<String, Double> cosmetics = new HashMap<>();
        cosmetics.put("Soap", 10.2);
        cosmetics.put("conditioner", 20.5);
        cosmetics.put("Shampoo", 30.99);

        HashMap<String, Double> grocery = new HashMap<>();
        grocery.putAll(beautyProducts);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        //grocery.remove() doesn't work we can't remove all the entries from the map
        grocery.clear();
        System.out.println(grocery);
    }
}
