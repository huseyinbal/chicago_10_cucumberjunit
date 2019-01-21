package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.DataTablePages;
import utilities.Driver;

public class DatatablesDefSteps {

    DataTablePages dtpobj = new DataTablePages();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clickes to New Button")
    public void user_clickes_to_New_Button() {
        dtpobj.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        dtpobj.emloyeeTable.isDisplayed();
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
        dtpobj.firstNameField.sendKeys("abdylkerim");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
        dtpobj.lastNameField.sendKeys("kerimow");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        dtpobj.positionField.sendKeys("sdet engineer");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dtpobj.officeField.sendKeys("Des Plaines office");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dtpobj.extensionField.sendKeys("dsds");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
        dtpobj.startDateField.sendKeys("2019-01-16");

    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dtpobj.salaryField.sendKeys("100000");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
        dtpobj.createButton.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
        dtpobj.searchField.sendKeys("abdylkerim");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {

        dtpobj.emloyeeTable.getText().contains("abdylkerim");
    }

    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String firsname) {
dtpobj.firstNameField.sendKeys(firsname);

    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastname) {

dtpobj.lastNameField.sendKeys(lastname);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
dtpobj.positionField.sendKeys(position);
    }

    @Then("User enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String firstname) {

dtpobj.searchField.sendKeys(firstname);
    }
}