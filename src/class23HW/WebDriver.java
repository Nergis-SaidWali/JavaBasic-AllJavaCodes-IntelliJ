package class23HW;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window for Google Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element on Google Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window for Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element on Firefox");
    }
}

