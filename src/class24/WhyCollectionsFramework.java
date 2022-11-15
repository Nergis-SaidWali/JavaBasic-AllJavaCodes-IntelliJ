package class24;

import java.util.ArrayList;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        /*
        * if we have  to store a single value we should use variables
        */
        String name="Josh";
        String name2="Joe";
        System.out.println(name);
        System.out.println(name2);

        /*
        * if we have to store more than 2 values of same kind then we should go with arrays
        */
        String[] names={"Reshad", "Adam", "Josh"};
        /*
        The limitations of arrays:
        1. arrays are fixed in size,
        2. no methods are available
         */
        String[] breeds= new String[10];
        breeds[0]="BullDogs";

        //How to create and array list and assign a value;
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.size();
    }
}
