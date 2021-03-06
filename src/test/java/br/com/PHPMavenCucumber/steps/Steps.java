package br.com.PHPMavenCucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    //WebDriver driver;
    //Implementation implementation = new Implementation(driver);
    Implementation implementation = new Implementation();

    @Given("user is on the {string} page") // Don't utilize RegEx notation with variables!
    public void userIsOnThePage(String string) {
        implementation.openPage(string);
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
