package class28HW;

import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        /*Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary.
        Output should be in the below format John Smith=$100000*/
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Adam", 80500);
        employee.put("Sami", 95000);
        employee.put("John", 80000);
        employee.put("Anastasia", 83000);
        employee.put("Yusuf", 92000);

        Set<Map.Entry<String, Integer>> entrySet = employee.entrySet();
        var iterator = employee.entrySet().iterator();
        Integer HighestSal = 0;
        Map.Entry m = null;
        while (iterator.hasNext()) {
            m = (Map.Entry) iterator.next();
            if ((int)m.getValue() > HighestSal) {
                HighestSal = (int) m.getValue();
            }
        }
        System.out.println(m.getKey() + "=" + m.getValue());
    }
}
