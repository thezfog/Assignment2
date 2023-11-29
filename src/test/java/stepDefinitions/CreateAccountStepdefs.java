package stepDefinitions;

import common.CreateAccount;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreateAccountStepdefs {

    private CreateAccount createAccount = new CreateAccount();

    @Before
    public void setUp (){
        createAccount.setUp();
        System.out.println("Setting up page");
    }

    @Given("I add the date of birth {}")
    public void iAddTheDateOfBirth(String dateOfBirth) throws InterruptedException {
        createAccount.addDateOfBirth(dateOfBirth);
        System.out.println();
        System.out.println(dateOfBirth);
    }

    @And("enter the valid first name {}")
    public void enterTheValidFirstName(String firstName) throws InterruptedException {
        createAccount.addFirstName(firstName);
        System.out.println();
        System.out.println(firstName);
    }

    @And("enter the valid last name {}")
    public void enterTheValidLastName(String lastName) throws InterruptedException{
        createAccount.addLastName(lastName);
        System.out.println();
        System.out.println(lastName);
    }

    @And("enter the valid email {}")
    public void enterTheValidEmail(String email) throws InterruptedException {
        createAccount.addEmail(email);
        System.out.println();
        System.out.println(email);
    }

    @And("confirm my valid email {}")
    public void confirmMyValidEmail(String email) throws InterruptedException {
        createAccount.addConfirmEmail(email);
        System.out.println();
        System.out.println(email);
    }

    @And("enter the valid password {}")
    public void enterTheValidPassword(String password) throws InterruptedException {
        createAccount.addPassword(password);
        System.out.println();
        System.out.println(password);
    }

    @And("confirm my valid password {}")
    public void confirmMyValidPassword(String password) throws InterruptedException {
        createAccount.addConfirmPassword(password);
        System.out.println();
        System.out.println(password);
    }

    @And("click confirm terms and conditions button")
    public void clickConfirmTermsAndConditionsButton() throws InterruptedException{
        createAccount.clickConditions();
        System.out.println();
        System.out.println("Confirm Terms");
    }

    @And("click confirm my age button")
    public void clickConfirmMyAgeButton() throws InterruptedException{
        createAccount.clickConfirmAge();
        System.out.println();
        System.out.println("Confirm Age");
    }

    @And("click code of conduct button")
    public void clickCodeOfCoductButton() throws InterruptedException{
        createAccount.clickCodeOfConduct();
        System.out.println();
        System.out.println("Confirm Code of Conduct");
    }

    @When("I click the confirm and join button")
    public void iClickTheConfirmAndJoinButton() throws InterruptedException{
        createAccount.clickJoin();
        System.out.println();
        System.out.println("Click Join");
    }

    @Then("a new account is made")
    public void aNewAccountIsMade() throws InterruptedException {
        String actual = createAccount.checkResult();
        String expected = "Your Basketball England Membership Number is:";
        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Account is made");
    }

    @Then("the button is active")
    public void theButtonIsActive() throws InterruptedException {
        boolean expected = true;
        boolean actual = createAccount.joinIsActive();
        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Button is clickable");
    }

    @Then("the button is inactive")
    public void theButtonIsInactive() throws InterruptedException {
        boolean expected = false;
        boolean actual = createAccount.joinIsActive();
        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Button is not clickable");
    }

    @After
    public void tearDown() throws InterruptedException{
        createAccount.tearDown();
    }
}
