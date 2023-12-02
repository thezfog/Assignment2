package stepDefinitions;

import common.CreateAccount;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class CreateAccountStepdefs {

    private CreateAccount createAccount = new CreateAccount();

    @Given("User is on the create account page and using the browser {}")
    public void userIsOnTheCreateAccountPageAndUsingTheBrowser(String browser) {
        createAccount.selectBrowser(browser);
        System.out.println("Selecting browser");
    }

    @And("add the date of birth {}")
    public void iAddTheDateOfBirth(String dateOfBirth) {
        createAccount.addDateOfBirth(dateOfBirth);
        System.out.println();
        System.out.println(dateOfBirth);
    }

    @And("add the first name {}")
    public void enterTheValidFirstName(String firstName) {
        createAccount.addFirstName(firstName);
        System.out.println();
        System.out.println(firstName);
    }

    @And("add the last name {}")
    public void enterTheValidLastName(String lastName) {
        createAccount.addLastName(lastName);
        System.out.println();
        System.out.println(lastName);
    }

    @And("add the email {}")
    public void enterTheValidEmail(String email) {
        createAccount.addEmail(email);
        System.out.println();
        System.out.println(email);
    }

    @And("confirm the email {}")
    public void confirmMyValidEmail(String confirmEmail) {
        createAccount.addConfirmEmail(confirmEmail);
        System.out.println();
        System.out.println(confirmEmail);
    }

    @And("add the password {}")
    public void enterTheValidPassword(String password) {
        createAccount.addPassword(password);
        System.out.println();
        System.out.println(password);
    }

    @And("confirm the password {}")
    public void confirmMyValidPassword(String confirmPassword) {
        createAccount.addConfirmPassword(confirmPassword);
        System.out.println();
        System.out.println(confirmPassword);
    }

    @And("click confirm terms and conditions button {}")
    public void clickConfirmTermsAndConditionsButton(String click) {
        createAccount.clickConditions(click);
        System.out.println();
        System.out.println("Confirm Terms");
    }

    @And("click confirm my age button {}")
    public void clickConfirmMyAgeButton(String click) {
        createAccount.clickConfirmAge(click);
        System.out.println();
        System.out.println("Confirm Age");
    }

    @And("click code of conduct button {}")
    public void clickCodeOfCoductButton(String click) {
        createAccount.clickCodeOfConduct(click);
        System.out.println();
        System.out.println("Confirm Code of Conduct");
    }

    @When("user click the confirm and join button")
    public void userClickTheConfirmAndJoinButton() {
        createAccount.clickJoin();
        System.out.println();
        System.out.println("Click Join");
    }

    @And("no error message {} is displayed")
    public void anErrorMessageIsDisplayed(String errorMessage) {
        if(errorMessage.isEmpty()){
            System.out.println("No error messages");
        }

        else {
            String expected = errorMessage;
            String actual = createAccount.checkErrorMessage();
            assertEquals(expected, actual);
            System.out.println();
            System.out.println("Error message is displayed");
        }
    }

    @After
    public void tearDown() {
        createAccount.tearDown();
    }
}
