package class21HW;

public class Task2 {
}
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
class CreditCard{
    double balance;
    double interestRate;

    CreditCard(double balance, double interestRate){
        this.balance=balance;
        this.interestRate=interestRate;
    }
    void CalculateInterest(){
        System.out.println(balance*interestRate);
    }
}
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
class Visa extends CreditCard{
    Visa(double balance, double interestRate){
        super(balance, interestRate);
    }
}
class AX extends CreditCard{
    AX(double balance, double interestRate){
        super(balance, interestRate);
    }
    @Override
    void CalculateInterest() {
        System.out.println(balance*interestRate*30/36500);
    }
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
         CreditCard obj=new CreditCard(1000, 2.5);
         obj.CalculateInterest();
         Visa obj2=new Visa(1000, 2.5);
         obj2.CalculateInterest();
         AX obj3=new AX(1000, 2.5);
         obj3.CalculateInterest();
    }
}
