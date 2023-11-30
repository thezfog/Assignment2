package stepDefinitions;

import common.CreateAccount;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreateAccountStepdefs {

    private CreateAccount createAccount = new CreateAccount();

    @Given("User is on the create account page and using the browser {}")
    public void userIsOnTheCreateAccountPageAndUsingTheBrowser(String browser) {
        createAccount.selectBrowser(browser);
        System.out.println("Setting up page");
    }

    @And("add the date of birth {}")
    public void iAddTheDateOfBirth(String dateOfBirth) throws InterruptedException {
        createAccount.addDateOfBirth(dateOfBirth);
        System.out.println();
        System.out.println(dateOfBirth);
    }

    @And("add the first name {}")
    public void enterTheValidFirstName(String firstName) throws InterruptedException {
        createAccount.addFirstName(firstName);
        System.out.println();
        System.out.println(firstName);
    }

    @And("add the last name {}")
    public void enterTheValidLastName(String lastName) throws InterruptedException{
        createAccount.addLastName(lastName);
        System.out.println();
        System.out.println(lastName);
    }

    @And("add the email {}")
    public void enterTheValidEmail(String email) throws InterruptedException {
        createAccount.addEmail(email);
        System.out.println();
        System.out.println(email);
    }

    @And("confirm the email {}")
    public void confirmMyValidEmail(String confirmEmail) throws InterruptedException {
        createAccount.addConfirmEmail(confirmEmail);
        System.out.println();
        System.out.println(confirmEmail);
    }

    @And("add the password {}")
    public void enterTheValidPassword(String password) throws InterruptedException {
        createAccount.addPassword(password);
        System.out.println();
        System.out.println(password);
    }

    @And("confirm the password {}")
    public void confirmMyValidPassword(String confirmPassword) throws InterruptedException {
        createAccount.addConfirmPassword(confirmPassword);
        System.out.println();
        System.out.println(confirmPassword);
    }

    @And("click confirm terms and conditions button {}")
    public void clickConfirmTermsAndConditionsButton(String click) throws InterruptedException{
        createAccount.clickConditions(click);
        System.out.println();
        System.out.println("Confirm Terms");
    }

    @And("click confirm my age button {}")
    public void clickConfirmMyAgeButton(String click) throws InterruptedException{
        createAccount.clickConfirmAge(click);
        System.out.println();
        System.out.println("Confirm Age");
    }

    @And("click code of conduct button {}")
    public void clickCodeOfCoductButton(String click) throws InterruptedException{
        createAccount.clickCodeOfConduct(click);
        System.out.println();
        System.out.println("Confirm Code of Conduct");
    }

    @When("user click the confirm and join button")
    public void userClickTheConfirmAndJoinButton() throws InterruptedException{
        createAccount.clickJoin();
        System.out.println();
        System.out.println("Click Join");
    }

    /*@Then("a new account is made")
    public void aNewAccountIsMade() throws InterruptedException {
        String actual = createAccount.checkResult();
        String expected = "Your Basketball England Membership Number is:";
        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Account is made");
    }*/

    @Then("the button is active")
    public void theButtonIsActive() throws InterruptedException {
        boolean expected = true;
        boolean actual = createAccount.joinIsActive();
        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Button is clickable");
    }

    @And("no error message {} is displayed")
    public void anErrorMessageIsDisplayed(String errorMessage) throws InterruptedException{
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

    @But("if any information is missing or invalid")
    public void ifAnyInformationIsMissingOrInvalid() {

    }

    @After
    public void tearDown() throws InterruptedException{
        createAccount.tearDown();
    }
}
