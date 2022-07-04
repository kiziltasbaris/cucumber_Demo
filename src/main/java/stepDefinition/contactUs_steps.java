package stepDefinition;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_steps {

    private WebDriver driver;
    contactUs_Page contactUs_Page= new contactUs_Page();


    @Given("navigate to Website")
    public void navigate_to_website() {
      driver= Driver.getDriver();
      driver.manage().window().maximize();
      driver.get("http://automationpractice.com/index.php");
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() {
     contactUs_Page.clickContactUsButton();

    }

    @Given("select subject heading")
    public void select_subject_heading() {

    }

    @Given("type Email")
    public void type_email() {

    }

    @Given("type order reference")
    public void type_order_reference() {

    }

    @Given("type a message")
    public void type_a_message() {

    }

    @When("click on submit button")
    public void click_on_submit_button() {

    }

    @Then("verify  success message")
    public void verify_success_message() {

    }
}
