package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    static WebDriver driver;
    //public static ChromeOptions options = new ChromeOptions();

    public static WebDriver open() {
        //options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        return driver;
    }
}
