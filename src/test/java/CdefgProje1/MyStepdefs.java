package CdefgProje1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Registersuccessful registersuccessful = new Registersuccessful();
    CurrencyChange currencyChange = new CurrencyChange();

    @Given("^user is on register page$")
    public void user_is_on_register_page()
    {
        homePage.clickOnRegisterButton();
        registerPage.useEnterRegistersIsOnRegisterPage();
        //verificationPage.verifyUserIsOnHomepage();

    }

    @When("^user enters all registration details$")
    public void user_enters_all_registration_details()  {
        registerPage.userEntersRegistratoinDetails();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully() {
        registersuccessful.verifyUserSeeSuccessfulMessage();

    }
    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
        homePage.clickOnRegisterButton();

    }

    @When("^user hover on Clothing$")
    public void userHoverOnClothing() {
        currencyChange.priceCurrency();

    }

    @And("^user click on change currency$")
    public void userClickOnChangeCurrency() {

    }

    @Then("^All product should show in Dollar value$")
    public void allProductShouldShowInDollarValue() {
    }
}
