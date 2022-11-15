package class26HW;

import java.util.ArrayList;

public class Task1 {
    /*Create a class Insurance that will have an attribute as insuranceName and
    unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel
     and Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
      Using for loop/advanced for loop/ iterator access all methods of the class. */
    public static void main(String[] args) {

        ArrayList<Insurance> allMethods = new ArrayList<>();
        allMethods.add(new Pet("petInsurance", "Cat"));
        allMethods.add(new Car("CarInsurance", "Togg"));
        allMethods.add(new Health("HealthInsurance"));


        for(var method:allMethods){
            method.getQuote();
            method.cancelInsurance();
        }
        }
    }

abstract class Insurance{
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("This is getQuote method for "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("This is cancelInsurance method for "+carModel);
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("This is getQuote method for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("This is cancelInsurance method for "+petType);
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("This is getQuote method for "+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("This is cancelInsurance method for "+insuranceName);
    }
}
