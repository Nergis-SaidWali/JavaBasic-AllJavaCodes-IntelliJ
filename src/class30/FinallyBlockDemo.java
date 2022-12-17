package class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){

        }finally {
            System.out.println("This block is always executed no matter what");
        }
    }
}
