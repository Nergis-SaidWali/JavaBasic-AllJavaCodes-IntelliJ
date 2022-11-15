package class25HW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Orange Juice");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Milk");
        drinks.add("Lemonade");


        var iterator=drinks.iterator();
        int count=0;
        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("a") || item.contains("e")){
                drinks.set(count, "water");
            }
            count++;
        }
        System.out.println(drinks);

//        ArrayList<String> drinks=new ArrayList<>();
//        drinks.add("Tea");
//        drinks.add("fresh Juice");
//        drinks.add("Iced Tea");
//        drinks.add("Soda");
//        drinks.add("canned Juice");
//        drinks.add("Milk");
//        drinks.add("Chocolate Milk");
//        for (int i = 0; i < drinks.size(); i++) {
//            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
//                drinks.set(i,"Water"); //replace
//            }
//        }
//        System.out.println(drinks);
    }
}
