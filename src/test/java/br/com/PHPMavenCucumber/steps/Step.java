package br.com.PHPMavenCucumber.steps;

import br.com.PHPMavenCucumber.implementations.Implementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Step {

    WebDriver driver;
    Implementation implementation = new Implementation(driver);

    @Given("^user is on the Infojobs page$")
    public void userIsOnTheInfojobsPage() {
        implementation.openInfojobsPage();
    }

    @When("^user clicks on the cookie button$")
    public void userClicksOnTheCookieButton() {
        implementation.clickOnTheCookieButton();
    }

    @And("^user enters their correct data$")
    public void userEntersTheirCorrectData() {
        implementation.entersTheirCorrectData();
    }

    @And("^user enters name (.*)$")
    public void userEntersName(String username) {
        implementation.entersName(username);
    }

    @And("^user enters email (.*)$")
    public void userEntersEmail(String email) {
        implementation.entersEmail(email);
    }

    @And("^user enters password (.*)$")
    public void userEntersPassword(String password) {
        implementation.entersPassword(password);
    }

    @And("^user enters address (.*)$")
    public void userEntersAddress(String address) {
        implementation.entersAddress(address);
    }

    @And("^user enters function (.*)$")
    public void userEntersFunction(String function) {
        implementation.entersFunction(function);
    }

    @And("^user clicks submit button$")
    public void userClicksSubmitButton() {
        implementation.clicksSubmitButton();
    }

    @Then("^user gets confirmation$")
    public void userGetsConfirmation() {
        implementation.getsConfirmation();
    }
}
