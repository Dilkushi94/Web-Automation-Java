package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {

    private WebDriver driver;
    private By successMessage = By.id("flash");
    private By logout = By.xpath("//*[@id=\"content\"]/div/a");


    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuceessMessage(){

        return driver.findElement(successMessage).getText();
    }

    public FormAuthentication clickLogout(){

        driver.findElement(logout).click();
        return new FormAuthentication(driver);
    }
}
