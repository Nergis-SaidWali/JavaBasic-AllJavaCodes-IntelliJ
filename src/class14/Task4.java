package class14;

public class Task4 {
    public static void main(String[] args) {
        String str="This is sentence I want to reverse";
        String[] array=str.split(" ");
        for(int i=0; i<array.length; i++) {
            String word=array[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            array[i]=stringBuilder.toString();
            System.out.print(array[i]+" ");

        }

        
    }
}
