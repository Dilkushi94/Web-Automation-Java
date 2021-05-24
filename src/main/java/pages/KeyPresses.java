package pages;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyPresses {

    private WebDriver driver;
    private By key = By.id("result");
    Actions action ;

    public KeyPresses(WebDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public String getDisplayText(){

        return driver.findElement(key).getText();
    }

    public void actions_tab() {

        action.sendKeys(Keys.TAB).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void actions_enter() {

        action.sendKeys(Keys.ENTER).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void actions_backSpace() {

        action.sendKeys(Keys.BACK_SPACE).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void actions_space(){

        action.sendKeys(Keys.SPACE).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}


