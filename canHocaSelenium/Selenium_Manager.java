package canHocaSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Selenium_Manager {
    public static void main(String[] args) {

        SeleniumManager.getInstance().getDriverPath("chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        SafariOptions options = new SafariOptions();
        SafariDriver driver2 = new SafariDriver(options);
        driver2.get("https://www.youtube.com");


    }
}
