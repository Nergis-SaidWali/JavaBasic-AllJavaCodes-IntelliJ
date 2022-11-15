package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Today is java class");

        StringBuffer stringBuffer=new StringBuffer("Today is java class");
        //older one, slow and not used mostly
        //StringBuilder is the latest version, better version, improved version.

        String str="Java is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
          /*
        IF we want to convert from a StringBuilder to A String we can use
        the below syntax
                */
        String newStr=stringBuilder1.toString();


    }
}
