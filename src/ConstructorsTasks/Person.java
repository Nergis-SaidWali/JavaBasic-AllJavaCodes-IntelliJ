package ConstructorsTasks;

public class Person {
    String name;
    String surname;
    String nationality;
    int age;
    int height;
    int weight;
    char gender;

    Person() {

    }

    public Person(String newName, String newSurname, String newNationality) {
        name=newName;
        surname=newSurname;
        nationality=newNationality;
    }
    private Person(int age, int height, int weight) {
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    protected Person(char gender) {
        this.gender=gender;
    }

    public static void main(String[] args) {
        Person obj=new Person("Nergis", "Said Wali", "Turkish");
        Person obj2=new Person(32, 60, 170);
        Person obj3=new Person('F');
        Person obj4=new Person();
    }

}
