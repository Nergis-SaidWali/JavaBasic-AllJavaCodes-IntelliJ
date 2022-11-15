package class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening");
    }
    void navigate(){
        System.out.println("opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends Browser{
    void openBrowser() {
        System.out.println("Opening the browser in less than 1 sec");
    }
}
class FireFox extends Browser{
    void openBrowser() {
        System.out.println("Opening the browser in less than 2 sec");
    }
}
