package class30;

public class TryCatchDemo {
    public static void main(String[] args) {
try{
    doSomething();
}catch(NullPointerException npe){
    System.out.println("Got null pointer exception");
}catch (IndexOutOfBoundsException e){
    System.out.println("Got index");
}catch(NegativeArraySizeException e){
    System.out.println("We can't create arrays with negative size");
} catch(Exception e){
    System.out.println("I can handle any type of exceptions");
}
    }
    public static void doSomething(){
        String name=null;
        System.out.println(name.length());
    }
}
