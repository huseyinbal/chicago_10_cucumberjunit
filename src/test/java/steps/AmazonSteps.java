package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonSteps {


    AmazonPage amzObj= new AmazonPage();

    @Given("User is on the Amazon homepage")
    public void user_is_on_the_Amazon_homepage() {

        Driver.getDriver().get("https://amazon.com");


    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        amzObj.amazonSearchBox.sendKeys("headphones");

    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        amzObj.searchButton.click();

    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
       String actualResult =amzObj.searchResult.getText();
       Assert.assertTrue("They keyword headphones was not located", actualResult.contains("headphones"));

    }

}
