package review4;

public class Apple extends Fruit {
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size, String taste) {
        super(name, shape, color); //color is private you initialize it, but you cant access it, you cant use it
        this.size=size;
        this.taste=taste;
    }
    Apple(String name, String shape, String color, String size, String taste, double price){
        this(name, shape, color, size, taste);

    }

    void makeJuice(){
        System.out.println("from "+name+" we can make "+taste+" juice");
    }
    void makeJuice(String fruit){
        System.out.println();
    }

    public static void main(String[] args) {
        Apple app=new Apple("apple", "circle", "red", "large", "sweet");
        //app.color; not visible since its access modifier is PRIVATE
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();// fruit class
        app.haveBenefits(); //fruit class
        app.makeJuice(); //from apple class

    }
}
