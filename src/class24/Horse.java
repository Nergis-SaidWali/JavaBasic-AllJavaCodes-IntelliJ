package class24;

public class Horse {
     String name;
    private String breed;
    private int age;
    private double weight;
    private double height;

    public Horse(String name, String breed, int age, double weight, double height) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Please enter a horse name!");
        }else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Please enter a horse breed!");
        } else {
            this.breed = breed;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Please enter a proper age!");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("A horse's weight can't be negative.");
        } else {
            this.weight = weight;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("A horse's height cannot be negative");
        } else {
            this.height = height;
        }
    }
    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight+" Height "+height);
    }
}
class Tester{
    public static void main(String[] args) {
        Horse obj = new Horse("Maximus", "Arabian", 10, 1500, 57);
        obj.printInfo();
    }
}
