package class14HW;

public class Task4WithVoid {
    void sayHello(String country){

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Country not supported");
        }
    }

    public static void main(String[] args) {
        Task4WithVoid task4=new Task4WithVoid();
        task4.sayHello("USA");
        task4.sayHello("Turkiye");
    }
}
