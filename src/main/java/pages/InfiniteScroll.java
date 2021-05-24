package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class InfiniteScroll {

    private WebDriver driver;
    private By header = By.xpath("//*[@id=\"content\"]/div/h3");


    public InfiniteScroll(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 460);");
        Thread.sleep(3000);
    }

    public void scrollUp() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -460);");
        Thread.sleep(3000);
    }

    public String getHeader(){

        return driver.findElement(header).getText();
    }
}
