package br.com.PHPMavenCucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "br.com.PHPMavenCucumber.steps",
        plugin = "pretty",
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


