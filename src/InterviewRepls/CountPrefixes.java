package InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPrefixes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("steve", "stevens", "danny", "steves", "dan", "john", "johny", "joe", "alex", "alexander"));
        List<String> query = new ArrayList<>();
        query.addAll(Arrays.asList("steve", "alex", "joe", "john", "dan"));
        System.out.println(countOnlyPrefixes(names, query));
    }


    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < query.size(); i++) {
            int count = 0;
            for (int j = 0; j < names.size(); j++) {
                if (names.get(j).startsWith(query.get(i)) && !names.get(j).equalsIgnoreCase(query.get(i))) {
                    count++;
                }

            }
            nums.add(count);
        }
        return nums;
    }
}

