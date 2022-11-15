package class19HW;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass
    // as  circle class. In circle class create a method to calculate the area of circle. Test your code
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    public Circle(double radius) {
        super(radius);
    }
    public void calculateArea(){
        double area;
        area=3.15*radius*radius;
        System.out.println("The area of a circle is "+area+"cm2");
    }
}
class Tester{
    public static void main(String[] args) {
        Circle circle=new Circle(9);
        circle.calculateArea();
    }
}
