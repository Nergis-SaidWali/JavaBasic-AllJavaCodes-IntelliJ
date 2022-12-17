package InterviewRepls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        String str = "00-44  #$% 48 55";
        System.out.println(formatString(str));
    }

    public static String formatString(String S) {
        String format=S.replaceAll("\\D", "");

        int track=3;
        String a="";
        a=format.substring(0,track)+'-';
        char[] array = format.toCharArray();
        for (int i = 3; i < array.length; i+=3) {
            track+=3;
            if (track > array.length) {
                a = a + format.substring(i);
            } else {
                a = a + format.substring(i, track) + '-';
            }
        }
        return a;
    }
}
