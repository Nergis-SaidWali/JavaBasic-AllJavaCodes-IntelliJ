package class19;

public class Dog extends Animal {
    //got the instances from the parent class
    public Dog(String name, String breed, String color) {
        super(name, breed, color);
    }



    class Cat extends Animal{
        //got the instances from the parent class

        Cat(String name, String breed, String color){
            super(name, breed, color);
        }
    }

}