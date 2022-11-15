package class25HW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    //Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("English");
        subjects.add("Math");
        subjects.add("Biology");
        subjects.add("Science");
        subjects.add("Social Studies");
        subjects.add("Art");

        var iterator= subjects.iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            if(item.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}
