package InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class HTML {
    public static void main(String[] args)
    {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String s)
    {
        String a = s.replace(">", "> ");

        String b = a.replace("<", " <");

        String[] array = b.split(" ");

        List<String> strings = new ArrayList<>();

        for(String c : array)
        {
            strings.add(c);
        }

        //System.out.println(Arrays.asList(array));

        for(int i = 0; i < strings.size() - 1; i++)
        {
            if(!strings.get(i).contains("<"))
                continue;

            else
            {
                String formattedString = strings.get(i).replace("<", "");
                strings.set(i,formattedString);
                for(int j = i + 1 ; j < strings.size(); j++)
                {
                    String controlString = "/" + strings.get(i);
                    if(strings.get(j).contains(controlString))
                    {
                        strings.set(i, "aa");
                        strings.set(j, "aa");
                        break;
                    }
                }
            }
        }
        for(String d : strings)
        {
            if(d.contains(">"))
                return d.replace(">","");
        }
        return "true";
    }
}

