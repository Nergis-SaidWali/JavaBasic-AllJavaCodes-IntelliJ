package Revision;

import java.util.Locale;

public class FirstDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Intellij is great");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*
        * StringBuilder allows any methods to change the original contentes of the variables
        * because StringBuilder is mutable
        * */

        String str="Intellij";
        str.toLowerCase();
        System.out.println(str);
        /*
        * String does not allow any methods to change the original contents of the variables
        because String is immutable */

        String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("USA");
        StringBuilder state2=new StringBuilder("USA");

    }
}
