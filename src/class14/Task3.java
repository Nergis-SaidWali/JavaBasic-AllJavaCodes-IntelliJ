package class14;

public class Task3 {
    public static void main(String[] args) {
        String str="Is it Saturday? Is it raining? Do we have a Java class for today?";
        String[] array=str.split("[?]");
        System.out.println(array.length);
    }
}
