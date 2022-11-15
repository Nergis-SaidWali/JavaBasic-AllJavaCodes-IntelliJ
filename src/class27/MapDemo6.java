package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        //before we are going for loops we have to use Keyset to collect all the key then proceed loop

        Collection<Double> values =fruit.values();//returns all the values from a map

        Iterator<Double> iterator=values.iterator();

        while(iterator.hasNext()){
            double value= iterator.next();
            if(value>2){
                iterator.remove();
            }
        }
        System.out.println(fruit);

        fruit.values().removeIf(x->x>2);
        System.out.println(fruit);
    }
}
