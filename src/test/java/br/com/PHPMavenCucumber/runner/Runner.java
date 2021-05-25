package br.com.PHPMavenCucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "br.com.PHPMavenCucumber.steps",
        //plugin = "pretty",
        //plugin = "usage",
        //plugin = { "pretty", "html:target/cucumber-reports" },
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        monochrome = true,
        //snippets = CucumberOptions.SnippetType.CAMELCASE,
        //dryRun = false,
        tags = "@Login"
)
public class Runner { //extends AbstractTestNGCucumberTests {

    //@org.testng.annotations.Test(dataProvider = "myTest")
    //public void test() {
        //Assert.assertTrue(true);
    //}
}


