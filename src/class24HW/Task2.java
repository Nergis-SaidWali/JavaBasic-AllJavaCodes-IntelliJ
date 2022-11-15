package class24HW;

import java.util.ArrayList;

public class Task2 {
    //Find out whether the given ArrayList is empty or not?
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Yusuf");
        names.add("Hamza");
        names.add("Ilyas");
        names.add("Feride");
        names.add("Gamze");
        System.out.println(names.isEmpty());
    }
}
