package class14HW;

public class Task5WithReturnValue {

    String createEmail(String firstName, String lastName, String emailType) {
        return (firstName+lastName+"@"+emailType+"com").toLowerCase();

    }

    public static void main(String[] args) {
        Task5WithReturnValue task5=new Task5WithReturnValue();
        String fullEmail= task5.createEmail("John", "Snow", "gmail");
        System.out.println("fullEmail = " + fullEmail);
    }
}
