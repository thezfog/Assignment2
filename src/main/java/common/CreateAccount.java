package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccount {

    private WebDriver driver;

    //Methods checks what browser to test, adds that driver and opens the page to test.
    // This can be extended to add other browsers
    public void selectBrowser(String browser){
        if (browser.equals("chrome")){
            this.driver = new ChromeDriver();
            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        }

        if (browser.equals("edge")){
            this.driver = new EdgeDriver();
            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        }
    }

    //Methods adds the selected date of birth to the date of birth field on the website
    public void addDateOfBirth(String dateOfBirth) {
        WebElement inputField = driver.findElement(By.name("DateOfBirth"));
        inputField.sendKeys(dateOfBirth);
    }

    //Methods adds the selected first name of birth to the first name field on the website
    public void addFirstName(String firstName) {
        WebElement inputField = driver.findElement(By.name("Forename"));
        inputField.sendKeys(firstName);
    }

    //Methods adds the selected last name to the last name field on the website
    public void addLastName(String lastName) {
        WebElement inputField = driver.findElement(By.name("Surname"));
        inputField.sendKeys(lastName);
    }

    //Methods adds the selected email to the email field on the website
    public void addEmail(String email) {
        WebElement inputField = driver.findElement(By.name("EmailAddress"));
        inputField.sendKeys(email);
    }

    ///Methods adds the selected confirm email to the confirm email field on the website
    public void addConfirmEmail(String email) {
        WebElement inputField = driver.findElement(By.name("ConfirmEmailAddress"));
        inputField.sendKeys(email);
    }

    //Methods adds the selected password to the password field on the website
    public void addPassword(String password) {
        WebElement inputField = driver.findElement(By.name("Password"));
        inputField.sendKeys(password);
    }

    //Methods adds the selected confirm password to the confirm password field on the website
    public void addConfirmPassword(String password) {
        WebElement inputField = driver.findElement(By.name("ConfirmPassword"));
        inputField.sendKeys(password);
    }

    //Methods finds and clicks on the confirm terms and conditions button
    public void clickConditions(String click) {
        if(click.equals("yes")) {
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box"));
            button.click();
        }
        else
            return;
    }

    //Methods finds and clicks on the confirm age button
    public void clickConfirmAge(String click) {
        if(click.equals("yes")) {
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box"));
            button.click();
        }
        else
            return;
    }

    //Methods finds and clicks on the confirm code of conduct button
    public void clickCodeOfConduct(String click) {
        if(click.equals("yes")){
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box"));
            button.click();
        }
        else
            return;
    }

    //Methods finds and clicks on the join button
    public void clickJoin() {
        WebElement button = driver.findElement(By.name("join"));
        button.click();
    }

    //Methods finds and returns error messages
    public String checkErrorMessage() {
        waitForElement(By.className("field-validation-error"));
        WebElement message = driver.findElement(By.className("field-validation-error"));
        return message.getText();
    }

    //Method for explicit wait
    private void waitForElement(By element) {
        new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }

    //Method closes the page
    public void tearDown() {
        driver.close();
    }
}
