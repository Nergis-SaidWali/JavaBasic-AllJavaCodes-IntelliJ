package class28HW;

import java.util.HashMap;
import java.util.Map;

public class HW1 {
    public static void main(String[] args) {
        /*Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/

        Map<Integer, String> building=new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Facebook");
        building.put(4, "eBay");
        building.put(5, "Syntax");
        building.put(6, "Amazon");
        building.put(7, "eBay");

        System.out.println("The number of floors in the building is: "+building.size()); //check the number of entries
        building.replace(3,"Toyota");
        building.remove(7);
        System.out.println(building);
    }
}
