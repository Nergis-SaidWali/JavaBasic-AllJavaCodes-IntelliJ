package ConstructorsTasks;

public class PhoneTester {
    public static void main(String[] args) {
        Phone obj=new Phone("Iphone", "13 ProMax", "Silver", 128);
        obj.printInfo();
        System.out.println("-------------------------------------------------------------");
        Phone obj2=new Phone();
        obj2.printInfo();
    }
}
