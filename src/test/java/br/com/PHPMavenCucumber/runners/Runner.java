package br.com.PHPMavenCucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.Assert;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "br.com.PHPMavenCucumber.steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@Login"
)
public class Runner extends AbstractTestNGCucumberTests {

    //@org.testng.annotations.Test(dataProvider = "myTest")
    //public void test() {
        //Assert.assertTrue(true);
    //}
}


