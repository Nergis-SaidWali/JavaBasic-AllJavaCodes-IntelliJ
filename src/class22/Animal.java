package class22;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}
class Panda extends Animal{
    @Override
    void eat() {
        System.out.println("Pandas eat bamboo");
    }
    //@override is an annotation that tell java to check for extra rules like if we are properly overriding a method or not
    @Override
    void sleep() {
        System.out.println("Pandas sleep for 14 hours");
    }
}

