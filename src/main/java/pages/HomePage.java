package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private By formAuthentication = By.linkText("Form Authentication");
    private By infiniteScroll = By.linkText("Infinite Scroll");
    private By keyPresses = By.linkText("Key Presses");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public FormAuthentication clickFormAuthentication(){

        driver.findElement(formAuthentication).click();
        return new FormAuthentication(driver);
    }

    public InfiniteScroll clickInfiniteScroll(){

        driver.findElement(infiniteScroll).click();
        return new InfiniteScroll(driver);
    }

    public KeyPresses clickKeyPresses(){

        driver.findElement(keyPresses).click();
        return new KeyPresses(driver);
    }
}
