package class14HW;

public class Task4 {
    /*Create a method that will say Hello in different
    language based on the country that will be passed when method is executed*/

    String Hello(String country) {

        String sayHello = null;
        switch (country) {
            case "Saudi Arabia":
                sayHello = "السلام عليكم";
                break;
            case "Turkey":
                sayHello = "Merhaba";
                break;
            case "Spain":
                sayHello = "Hola";
                break;
            case "Uzbekistan":
                sayHello = "Assalomu Alaykum";
                break;
            default:
                sayHello = "Unknown";
                break;
        }
        return sayHello;
    }

        public static void main (String[]args){

            Task4 a = new Task4();
            String cntry="Uzbekistan";
            System.out.println(a.Hello(cntry));


        }

    }
