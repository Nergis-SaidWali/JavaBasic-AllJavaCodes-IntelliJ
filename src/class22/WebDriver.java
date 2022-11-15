package class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Google Chrome");
    }
    public void test(){
        System.out.println("Perform the testing on Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
}
class Firefox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Firefox");
    }
    public void test(){
        System.out.println("Perform the testing on Firefox");
    }
    public void closeBrowser(){
        System.out.println("Closing the Firefox");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("Perform the testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the Safari");
    }
}
