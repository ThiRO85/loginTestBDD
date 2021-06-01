package br.com.PHPMavenCucumber.steps;

import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;
import utilities.FileReaderManager;

public class Implementation {

    WebDriver driver;

    public Implementation() {
    }

    //public Implementation(WebDriver driver) {
    //this.driver = driver;
    //PageFactory.initElements(driver, this);
    //}

    public void openPage(String string) {
        System.out.println("User is on the " + string + " page");
    }

    public void clickOnTheCookieButton() {
        System.out.println("User clicks on the cookie button");
        //driver.findElement(By.id("AllowCookiesButton")).click();
    }

    public void entersTheirCorrectData() {
        System.out.println("User enters their correct data");
        //driver.findElement(By.name("NameAndSurname")).sendKeys("mary smith");
        //driver.findElement(By.name("Email")).sendKeys("mary@testmail.com");
        //driver.findElement(By.name("Password")).sendKeys("marypass");
        //driver.findElement(By.name("CEP")).sendKeys("06045-360");
        //driver.findElement(By.name("Job")).sendKeys("developer");
    }

    public void entersName(String username) {
        System.out.println("User enters name: " + username);
        //driver.findElement(By.name("NameAndSurname")).sendKeys(username);
    }

    public void entersEmail(String email) {
        System.out.println("User enters email: " + email);
        //driver.findElement(By.name("Email")).sendKeys(email);
    }

    public void entersPassword(String password) {
        System.out.println("User enters password: " + password);
        //driver.findElement(By.name("Password")).sendKeys(password);
    }

    public void entersAddress(String address) {
        System.out.println("User enters address: " + address);
        //driver.findElement(By.name("CEP")).sendKeys(address);
    }

    public void entersFunction(String function) {
        System.out.println("User enters function: " + function);
        //driver.findElement(By.name("Job")).sendKeys(function);
    }

    public void clicksSubmitButton() {
        System.out.println("User clicks submit button");
        //driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[1]/div[6]/div/label/a[1]")).click();
    }

    public void getsConfirmation() {
        System.out.println("User gets confirmation");
        //List<String> windows = new ArrayList<String>(driver.getWindowHandles());
        //driver.switchTo().window(windows.get(1));
        //String conf = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]")).getText();
        //System.out.println("CONFIRMATION: " + conf);
        //Assert.assertTrue(conf.contains("Candidatos"));
    }
}


