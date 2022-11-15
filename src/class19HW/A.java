package class19HW;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String name;
    String color;
    String season;
    public A(String name, String color, String season){
        this.name=name;
        this.color=color;
        this.season=season;
    }
}
class B extends A{
    public B(String name, String color, String season){
        super(name, color, season);
    }
}
class C extends B{
    public C(String name, String color, String season){
        super(name, color, season);
    }

}
