package base;
import org.testng.annotations.*;
import pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

    private WebDriver driver;
    protected HomePage homePage;
    protected FormAuthentication formAuthentication;
    protected InfiniteScroll infiniteScroll;
    protected KeyPresses keyPresses;
    protected SecureArea secureArea;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
        formAuthentication = new FormAuthentication(driver);
        infiniteScroll = new InfiniteScroll(driver);
        keyPresses = new KeyPresses(driver);
        secureArea = new SecureArea(driver);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
