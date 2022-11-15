package class28HW;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
        HashMap<String, String> BestBuyStore=new HashMap<>();
        BestBuyStore.put("7664847", "Printer");
        BestBuyStore.put("7879885", "TV");
        BestBuyStore.put("7945031", "Computer");
        BestBuyStore.put("7298710", "Keyboard");
        BestBuyStore.put("7659402", "DishWasher");
        BestBuyStore.put("7873467", "Fridge");
        BestBuyStore.put("8945738", "HairDryer");
        BestBuyStore.put("8765493", "WashingMachine");

        Set<Map.Entry<String, String>> KeysValues=BestBuyStore.entrySet();
        Iterator<Map.Entry<String,String>> iterator=BestBuyStore.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            System.out.println(m.getKey()+ "-" +m.getValue());
        }

    }
}
