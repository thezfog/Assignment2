package stepDefinitions;

import common.CreateAccount;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class CreateAccountStepdefs {

    private CreateAccount createAccount = new CreateAccount();

    @Given("User is on the create account page and using the browser {}")
    public void userIsOnTheCreateAccountPageAndUsingTheBrowser(String browser) {
        createAccount.selectBrowser(browser);
    }

    @And("adds the date of birth {}")
    public void addTheDateOfBirth(String dateOfBirth) {
        createAccount.addDateOfBirth(dateOfBirth);
    }

    @And("adds the first name {}")
    public void enterTheValidFirstName(String firstName) {
        createAccount.addFirstName(firstName);
    }

    @And("adds the last name {}")
    public void enterTheValidLastName(String lastName) {
        createAccount.addLastName(lastName);
    }

    @And("adds the email {}")
    public void enterTheValidEmail(String email) {
        createAccount.addEmail(email);
    }

    @And("confirms the email {}")
    public void confirmMyValidEmail(String confirmEmail) {
        createAccount.addConfirmEmail(confirmEmail);
    }

    @And("adds the password {}")
    public void enterTheValidPassword(String password) {
        createAccount.addPassword(password);
    }

    @And("confirms the password {}")
    public void confirmMyValidPassword(String confirmPassword) {
        createAccount.addConfirmPassword(confirmPassword);
    }

    @And("clicks confirm terms and conditions button {}")
    public void clickConfirmTermsAndConditionsButton(String click) {
        createAccount.clickConditions(click);
    }

    @And("clicks confirm age button {}")
    public void clickConfirmMyAgeButton(String click) {
        createAccount.clickConfirmAge(click);
    }

    @And("clicks code of conduct button {}")
    public void clickCodeOfCoductButton(String click) {
        createAccount.clickCodeOfConduct(click);
    }

    @When("user clicks the confirm and join button")
    public void userClickTheConfirmAndJoinButton() {
        createAccount.clickJoin();
    }

    @Then("a new account is made and no error message {} is displayed")
    public void anErrorMessageIsDisplayed(String errorMessage) {
        if(!errorMessage.isEmpty()) {
            String expected = errorMessage;
            String actual = createAccount.checkErrorMessage();
            assertEquals(expected, actual);
        }
    }

    @After
    public void tearDown() {
        createAccount.tearDown();
    }
}
