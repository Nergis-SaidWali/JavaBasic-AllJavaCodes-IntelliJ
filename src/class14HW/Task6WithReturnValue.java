package class14HW;

public class Task6WithReturnValue {

    boolean isPrime(int num){
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Task6WithReturnValue task6=new Task6WithReturnValue();
        System.out.println(task6.isPrime(12));
        System.out.println(task6.isPrime(5));
    }
}
