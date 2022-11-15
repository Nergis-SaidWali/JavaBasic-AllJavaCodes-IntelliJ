package class21HW;

public class Task1 {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("To get a Masters you need Bachelors degree");
    }
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        Degree obj=new Degree();
        obj.getPrerequisite();
        Bachelors obj2=new Bachelors();
        obj2.getPrerequisite();
        Masters obj3=new Masters();
        obj3.getPrerequisite();
    }
}


