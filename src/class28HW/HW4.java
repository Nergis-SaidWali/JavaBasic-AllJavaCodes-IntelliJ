package class28HW;

import java.util.TreeMap;

public class HW4 {
        /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.*/
        public static void main(String[] args) {
            TreeMap<Integer, Person> person=new TreeMap<>();
            person.put(01, (new Person("Yusuf", "SaidWali", 20, 80000)));
            person.put(02, (new Person("Hamza", "SaidWali", 25, 90000)));
            person.put(03, (new Person("Adam", "Kruger", 30, 100000)));
            person.put(04, (new Person("Sami", "Yusuf", 40, 90000)));
            person.put(05, (new Person("Susan", "Boyle", 60, 80000)));

            for (Integer key:person.keySet()) {
                person.get(key).userDetails();
            }
        }
}

class Person{
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void userDetails(){
        System.out.println("Name: "+name+" "+lastName+", Age: "+age+", Salary: "+salary);
    }
}


