package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class google_step_Defs {

    GooglePage gpObj=new GooglePage();

    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("https://google.com");
    }

    @Given("User enters flowers keyword")
    public void user_enters_flowers_keyword() {
gpObj.searchBox.sendKeys("flowers");
    }

    @When("User clickes search button")
    public void user_clickes_search_button() {
gpObj.searchButton.click();
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {

String googleTitle=Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword flowers not located in title", googleTitle.contains("flower"));

    }



}
