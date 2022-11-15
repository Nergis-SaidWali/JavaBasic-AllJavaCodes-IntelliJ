package class15;

public class LocalVarDemo {

    public static void main(String[] args) {
        int number=0;
 /*
 * Local variables are defined inside blocks of code and can only be used inside those blocks*/
        String name = null;
        System.out.println(name);
    }

    void printNumber() {
        int number=4;
        //System.out.println(number);
        String name="Allan";
    }
}
