package br.com.PHPMavenCucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;
import utilities.FileReaderManager;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("This will run before the Scenario");
        //driver = DriverFactory.open();
        //driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());

    }

    @After
    public void tearDown() {
        System.out.println("This will run after the Scenario");
        //driver.quit();
    }
}
