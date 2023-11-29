package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

    public WebDriver driver = new ChromeDriver();

    public void setUp(){
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
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

    public void clickConditions() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[1]/label/span[3]"));
        button.click();
    }

    public void clickConfirmAge() throws InterruptedException{
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[2]/label/span[3]"));
        button.click();
    }

    public void clickCodeOfConduct() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[7]/label/span[3]"));
        //WebElement button = driver.findElement(By.name("AgreeToCodeOfEthicsAndConduct"));
        button.click();
    }

    public void clickJoin() throws InterruptedException {
        WebElement button = driver.findElement(By.name("join"));
        button.click();
    }

    public String checkResult() throws InterruptedException {
        WebElement result = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h5"));
        return result.getText();
    }

    public boolean joinIsActive() throws InterruptedException {
        WebElement button = driver.findElement(By.name("join"));
        return button.isEnabled();
    }

    public void tearDown() throws InterruptedException {
        driver.close();
    }
}
