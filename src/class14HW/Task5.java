package class14HW;

public class Task5 {
    /*Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return complete email Address. Example:
     createEmail(John, Snow, gmail) → johnsnow@gmail.com or */

    void Email(String name, String surname, String addressType) {
        System.out.println(name.toLowerCase()+surname.toLowerCase()+"@"+addressType.toLowerCase()+"com");
    }

    public static void main(String[] args) {
        Task5 emailAddress=new Task5();
        emailAddress.Email("nergis", "saidwali", "gmail");
    }
}
