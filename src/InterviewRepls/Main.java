package InterviewRepls;

import org.apache.poi.poifs.filesystem.Entry;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        List<Map<String, Object>> dataList = new ArrayList<>(); //Step1

        Map<String, Object> appleMap = new LinkedHashMap<>(); //Step2
        appleMap.put("Items", "Apple");
        appleMap.put("Price", "20.00");
        appleMap.put("Quantity", "10");

        dataList.add(appleMap); //Step3

        Map<String, Object> orangeMap = new LinkedHashMap<>(); //Step4
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", "21.99");
        orangeMap.put("Quantity", "10");

        dataList.add(orangeMap); //Step5

        double Total = 0;

        for (Map<String, Object> list : dataList) {
            double price= (double) list.get("Price");
            double quantity= (double) list.get("Quantity");
            Object subtotal = price*quantity;
            Total += (double)subtotal;
            list.put("SubTotal", subtotal);
            Set< Map.Entry<String, Object>> setOfDataEntriesOfEachMap=  list.entrySet();
            for (var entry : setOfDataEntriesOfEachMap) {
                System.out.print(entry.getKey() + ": " + entry.getValue()+" ");
            }
            System.out.println("  ");
            System.out.println("  ");
        }
      /*  double Total= 0;
        for (Map<String, Object> list : dataList) {
                double price = (double) list.get("Price");
                double quantity = (double) list.get("Quantity");
                Object subTotal = price * quantity;
                Total += (double) subTotal;
                list.put("SubTotal", subTotal);
            Set< Map.Entry<String, Object>> setOfDataEntriesOfEachMap=list.entrySet();
            for (var entry : setOfDataEntriesOfEachMap) {
                System.out.print(entry.getKey() + ": " + entry.getValue()+" ");
            }
            System.out.println("");*/

        System.out.println("Your Purchase total : " + Total);
    }
}
