package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

    private WebDriver driver;

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
    public void addDateOfBirth(String dateOfBirth) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("DateOfBirth"));
        inputField.sendKeys(dateOfBirth);
    }

    public void addFirstName(String firstName) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("Forename"));
        inputField.sendKeys(firstName);
    }

    public void addLastName(String lastName) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("Surname"));
        inputField.sendKeys(lastName);
    }

    public void addEmail(String email) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("EmailAddress"));
        inputField.sendKeys(email);
    }

    public void addConfirmEmail(String email) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("ConfirmEmailAddress"));
        inputField.sendKeys(email);
    }

    public void addPassword(String password) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("Password"));
        inputField.sendKeys(password);
    }

    public void addConfirmPassword(String password) throws InterruptedException {
        WebElement inputField = driver.findElement(By.name("ConfirmPassword"));
        inputField.sendKeys(password);
    }

    public void clickConditions(String click) throws InterruptedException {
        if(click.equals("yes")) {
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box"));
            button.click();
        }
        else
            return;
    }

    public void clickConfirmAge(String click) throws InterruptedException{
        if(click.equals("yes")) {
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box"));
            button.click();
        }
        else
            return;
    }

    public void clickCodeOfConduct(String click) throws InterruptedException {
        if(click.equals("yes")){
            WebElement button = driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box"));
            //WebElement button = driver.findElement(By.name("AgreeToCodeOfEthicsAndConduct"));
            button.click();
        }
        else
            return;
    }

    public void clickJoin() throws InterruptedException {
        WebElement button = driver.findElement(By.name("join"));
        button.click();
    }

    public boolean joinIsActive() throws InterruptedException {
        WebElement button = driver.findElement(By.name("join"));
        return button.isEnabled();
    }

    public String checkErrorMessage() throws InterruptedException {
        WebElement message = driver.findElement(By.className("field-validation-error"));
        return message.getText();
    }

    public void tearDown() throws InterruptedException {
        driver.close();
    }

}
