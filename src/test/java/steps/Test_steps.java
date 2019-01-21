package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
    @When("user goes to google application")
    public void user_goes_to_google_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sea");
        throw new cucumber.api.PendingException();
    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user checking the results of search");
        throw new cucumber.api.PendingException();
    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
