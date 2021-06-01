package br.com.PHPMavenCucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import com.cucumber.listener.Reporter;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "br.com.PHPMavenCucumber.steps",
        //plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        //plugin = "usage",
        //plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml" },
        monochrome = true,
        //snippets = CucumberOptions.SnippetType.CAMELCASE,
        //dryRun = false,
        tags = "@Login"
)
public class Runner extends AbstractTestNGCucumberTests {

    //@AfterClass
    //public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    //}
}




