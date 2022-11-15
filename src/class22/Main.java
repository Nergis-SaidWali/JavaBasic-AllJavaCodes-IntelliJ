package class22;

class Main implements Functions {
    public void display(double result){
        System.out.println("Result is "+result);
    }
    public double adding(double firstNumber, double SecondNumber){
        double result=firstNumber+SecondNumber;
        return result;
    }
    public double subtracting(double firstNumber, double SecondNumber){
        double result=firstNumber-SecondNumber;
        return result;
    }
    public double multiply(double firstNumber, double SecondNumber){
        double result=firstNumber*SecondNumber;
        return result;
    }
    public double dividing(double firstNumber, double SecondNumber){
        double result=firstNumber/SecondNumber;
        return result;
    }
    public static void main(String[] args){
        Main obj=new Main();
        obj.display(obj.adding(100.00, 20.00));
        obj.display(obj.subtracting(100.00, 20.00));
        obj.display(obj.multiply(100.00, 20.00));
        obj.display(obj.dividing(100.00, 20.00));

    }
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding(double firstNumber, double SecondNumber);
    double subtracting(double firstNumber, double SecondNumber);
    double multiply(double firstNumber, double SecondNumber);
    double dividing(double firstNumber, double SecondNumber);
}