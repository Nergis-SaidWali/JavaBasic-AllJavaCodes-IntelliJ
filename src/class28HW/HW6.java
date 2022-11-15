package class28HW;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HW6 {
    public static void main(String[] args) {
        /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/

        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("I");
        names.add("love");
        names.add("Java.");
        names.add("It");
        names.add("is");
        names.add("fun!");

        for (String name:names) {
            System.out.print(name+" ");
        }
    }
}
