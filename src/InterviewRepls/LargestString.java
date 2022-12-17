package InterviewRepls;

import java.util.ArrayList;
import java.util.List;

public class LargestString {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("I am very good at java"));
    }

    public static String findMaxLenEven(String str) {
        String[] array = str.split(" ");
       // List<String> empty = new ArrayList<>();
        String largestWord = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0 && largestWord.length() < array[i].length()) {
                largestWord = array[i];
                //empty.add(largestWord);
            }
            }
        if(largestWord.isEmpty()){
            return "-1";
        }
        return largestWord;
    }
}
