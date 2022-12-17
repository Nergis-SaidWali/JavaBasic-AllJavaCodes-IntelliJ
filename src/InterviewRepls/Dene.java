package InterviewRepls;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Dene {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int largestNum = 0;
        int secondLargestNum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (largestNum < list.get(i)) {
                largestNum = list.get(i);
            }
        }
        list.remove(Integer.valueOf(largestNum));

        for (int j = 0; j < list.size(); j++) {
            if (secondLargestNum < list.get(j)) {
                secondLargestNum = list.get(j);
            }
        }
        int largestSum = largestNum + secondLargestNum;
        return largestSum;
    }
}











