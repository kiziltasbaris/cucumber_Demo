package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps {



    @Given("Go to Amazon website")
    public void go_to_amazon_website() {
        System.out.println("Siteye gidildi");
    }

    @Given("click to login button")
    public void click_to_login_button() {
        System.out.println("Login butonuna tiklandi");
    }

    @Given("enter to name")
    public void enter_to_name() {
     System.out.println("isim girildi");
    }

    @Given("enter to password")
    public void enter_to_password() {
     System.out.println("sifre girildi");
    }

    @When("when you click to submit button")
    public void when_you_click_to_submit_button() {
        System.out.println("Submit butonuna tiklandi");
    }

    @Then("verify to success message")
    public void verify_to_success_message() {
        System.out.println("Login islem basariyla tamamlandi");
    }

}
