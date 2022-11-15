package class19;

class Vehicle{
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed() {
        System.out.println(topSpeed);
    }
}

public class Car extends Vehicle {
    String model;
    String make;
    int year;

}

class Tesla extends Car {
void printInfo() {
    System.out.println("I am an electrical car");
}
}

class Toyota extends Car{
    void printInfo() {
        System.out.println("I am a combustion engine car");
    }

}

//class customCar extends Toyota,Tesla { -->This is not allowed because of diamond problem



class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.printTopSpeed();
    }
}
