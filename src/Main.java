import org.apache.poi.poifs.filesystem.Entry;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10.0);

        List<Map<String, Object>> dataList = new LinkedList<>();
        dataList.add(appleMap);
        //System.out.println(dataList);

        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);

        dataList.add(orangeMap);
        //System.out.println(dataList);

        double total = 0;
        double price = 0;
        double quantity = 0;

        for (Map<String, Object> listData : dataList) {
            for (var entry : listData.entrySet()) {
                if (entry.getKey().equals("Price")) {
                    price = Double.parseDouble(entry.getValue().toString());
                } else if (entry.getKey().equals("Quantity")) {
                    quantity = Double.parseDouble(entry.getValue().toString());
                }
                System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            }
            total += price * quantity;
            System.out.print(" SubTotal: " + (price * quantity));
            System.out.println();
            System.out.println();
        }
        System.out.println("Your Purchase total : " + total);
    }
}
