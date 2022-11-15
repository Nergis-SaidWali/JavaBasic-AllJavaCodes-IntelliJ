package class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        fruit.entrySet();
        Set<Map.Entry<String,Double>> entrySet=fruit.entrySet();

        var iterator=fruit.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            System.out.println(m.getKey()+ "---------" +m.getValue());
        }
    }
}
