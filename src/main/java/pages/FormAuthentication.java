package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthentication {

    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginbutton = By.cssSelector("#login button");
    private By errorMessage = By.id("flash");

    public FormAuthentication(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){

        driver.findElement(this.username).sendKeys(username);
    }

    public void setPassword(String password){

        driver.findElement(this.password).sendKeys(password);
    }

    public String getErrorMessage(){

        return driver.findElement(errorMessage).getText();
    }

    public SecureArea clickLoginButton(){

        driver.findElement(loginbutton).click();
        return new SecureArea(driver);
    }
}
