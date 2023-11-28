package stepDefinitions;

import common.CreateAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepdefs {

    private CreateAccount createAccount;
    @Given("I add the date of birth {}")
    public void iAddTheDateOfBirth(String dateOfBirth) {
        //createAccount.addDateOfBirth();
        System.out.println();
        System.out.println(dateOfBirth);
    }

    @And("enter the valid first name {}")
    public void enterTheValidFirstName(String firstName) {
        //createAccount.addFirstName();
        System.out.println();
        System.out.println(firstName);
    }

    @And("enter the valid last name {}")
    public void enterTheValidLastName(String lastName) {
        //createAccount.addLastName();
        System.out.println();
        System.out.println(lastName);
    }

    @And("enter the valid email {}")
    public void enterTheValidEmail(String email) {
        //createAccount.addEmail();
        System.out.println();
        System.out.println(email);
    }

    @And("confirm my valid email {}")
    public void confirmMyValidEmail(String email) {
        //createAccount.addConfirmEmail();
        System.out.println();
        System.out.println(email);
    }

    @And("enter the valid password {}")
    public void enterTheValidPassword(String password) {
        //createAccount.addPassword();
        System.out.println();
        System.out.println(password);
    }

    @And("confirm my valid password {}")
    public void confirmMyValidPassword(String password) {
        //createAccount.addConfirmPassword();
        System.out.println();
        System.out.println(password);
    }

    @And("click confirm terms and conditions button")
    public void clickConfirmTermsAndConditionsButton() {
        //createAccount.clickConditions();
        System.out.println();
        System.out.println("Confirm Terms");
    }

    @And("click confirm my age button")
    public void clickConfirmMyAgeButton() {
        //createAccount.clickConfirmAge();
        System.out.println();
        System.out.println("Confirm Age");
    }

    @And("click code of conduct button")
    public void clickCodeOfCoductButton() {
        //createAccount.clickCodeOfConduct();
        System.out.println();
        System.out.println("Confirm Code of Conduct");
    }

    @When("I click the confirm and join button")
    public void iClickTheConfirmAndJoinButton() {
        //createAccount.clickJoin();
        System.out.println();
        System.out.println("Click Join");
    }

    @Then("a new account is made")
    public void aNewAccountIsMade() {

        System.out.println();
        System.out.println("Account is made");
    }
}
