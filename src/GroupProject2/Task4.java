package GroupProject2;

public class Task4 {
    //Provide Implementation for the diagram below. Then
    //create a test class in which you need to create Objects of
    //ChromeDriver, FirefoxDrive and SafariDriver classes and
    //see which methods available to them
}
class Test{

}
interface WebDriver{
    void Open();
    void Close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();

}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void Open() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void Close() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get a screenshot of your Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to your Google Chrome");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void Open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void Close() {
        System.out.println("Close FireFox");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void Open() {
        System.out.println("Open Safari");
    }

    @Override
    public void Close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

