package class18HW;

public class Student {
    /*
     * Write a Student class   that have instance variables name and address.
     * Create a constructor that will initialize those variables.
     *  Print name & address of given  student using displayInfo method.*/

    String name;
    String address;

    public Student(String name, String address) {
        this.name=name;
        this.address=address;
    }

    void printInfo(){
        System.out.println("Name is "+name+" and address is "+address);
    }

    public static void main(String[] args) {
        Student obj=new Student("Hamza", "Ayaz street, Gungoren district, Istanbul");
        obj.printInfo();
    }
}
