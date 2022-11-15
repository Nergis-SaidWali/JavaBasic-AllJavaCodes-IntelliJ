package class20HW;

public class Task1 {
}
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//Rectangle
//Square
//Box
//
//Use separate class to test your code
class AreaManager{
    int CalculateArea(int a, int b){
        return a*b;
    }
    int CalculateArea(int a){
        return a*a;
    }
    int volumeOfBox(int l, int w, int h){
        return l*w*h;
    }
}
class MethodTest{
    public static void main(String[] args) {
        AreaManager obj=new AreaManager();
        System.out.println(obj.CalculateArea(5,8));
        System.out.println(obj.CalculateArea(7));
        System.out.println(obj.volumeOfBox(5,3,4));
    }
}
