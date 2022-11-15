package class18;

public class Horse extends Animal {


    public Horse(String name, String breed, int age, double weight) {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;

    }

    void printInfo() {
        String name= "now this will be printed"; // whenever there is a conflict use this keyword
        System.out.println("name "+this.name+" breed "+breed+" age "+age+" weight "+weight);
        //1 local and 1 instance can coexist!
    }

    public static void main(String[] args) {

        Horse horseObject=new Horse("Spirit", "Stallion", 20, 400);
        horseObject.printInfo();
    }


}
