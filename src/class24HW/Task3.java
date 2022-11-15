package class24HW;

import java.util.ArrayList;

public class Task3 {
    //Check whether the specific name is present in an ArrayList or not?
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Yusuf");
        names.add("Hamza");
        names.add("Ilyas");
        names.add("Feride");
        names.add("Gamze");
        System.out.println(names.contains("Hamza"));
    }
}
