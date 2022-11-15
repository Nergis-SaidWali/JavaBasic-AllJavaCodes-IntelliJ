package Revision;

public class Main {
    static int countA(String s){
        String str= s.replaceAll("[^Aa]", "");
        int count=str.length();
        return count;
    }
    public static void main(String[] args){
        System.out.println(countA("aaAldfld"));
    }
}

