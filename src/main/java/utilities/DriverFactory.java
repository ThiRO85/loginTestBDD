package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver driver;

    public static WebDriver open() {
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        return driver;
    }
}
