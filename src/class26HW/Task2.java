package class26HW;

import java.util.LinkedList;

public class Task2 {
    /*Create a Card class that will have implemented  and unimplemented methods
    and a constructor that will initializes credit card type.  Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList. Using for loop/advanced
     for loop/ iterator access all methods of the class.*/

    public static void main(String[] args) {
        MasterCard obj=new MasterCard("Mastercard");
        Visa obj2=new Visa("Visa");
        Kuveytturk obj3=new Kuveytturk("Kuveytturk");

        LinkedList<Card> creditCards=new LinkedList<>();
        creditCards.add(obj);
        creditCards.add(obj2);
        creditCards.add(obj3);

        for(var creditCard:creditCards){
            creditCard.payment();
            creditCard.getBalance();
        }
    }
}
abstract class Card{
    String creditCardType;
    Card(String creditCardType){
        this.creditCardType=creditCardType;
    }
    void payment(){
        System.out.println("You need to pay for your "+creditCardType);
    }
    abstract void getBalance();
}
class MasterCard extends Card{

    MasterCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBalance() {
        System.out.println("Your balance for "+creditCardType+" is.....");
    }
}
class Visa extends Card{

    Visa(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBalance() {
        System.out.println("Your balance for "+creditCardType+" is.....");
    }
}
class Kuveytturk extends Card{

    Kuveytturk(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBalance() {
        System.out.println("Your balance for "+creditCardType+" is.....");
    }
}