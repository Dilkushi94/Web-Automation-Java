package tests;
import base.Base;
import org.testng.annotations.Test;
import  static org.testng.Assert.*;

public class Tests extends Base {

    @Test(priority = 1)
    public void TestCase_1_Senario1(){

        homePage.clickFormAuthentication();
        formAuthentication.setUsername("tomsmith");
        formAuthentication.setPassword("123Supersecret");
        formAuthentication.clickLoginButton();
        assertTrue(formAuthentication.getErrorMessage().contains("Your password is invalid!"));
    }

    @Test(priority = 2)
    public void TestCase_1_Senario2(){
        homePage.clickFormAuthentication();
        formAuthentication.setUsername("tom");
        formAuthentication.setPassword("SuperSecretPassword!");
        formAuthentication.clickLoginButton();
        assertTrue(formAuthentication.getErrorMessage().contains("Your username is invalid!"));
    }

    @Test(priority = 3)
    public void TestCase_1_Senario3(){
        homePage.clickFormAuthentication();
        formAuthentication.setUsername("tomsmith");
        formAuthentication.setPassword("SuperSecretPassword!");
        formAuthentication.clickLoginButton();
        assertTrue(secureArea.getSuceessMessage().contains("You logged into a secure area!"));
        secureArea.clickLogout();
    }

    @Test(priority = 4)
    public void TestCase_2() throws InterruptedException {
        homePage.clickInfiniteScroll();
        this.infiniteScroll.scrollDown();
        this.infiniteScroll.scrollDown();
        this.infiniteScroll.scrollUp();
        assertTrue(infiniteScroll.getHeader().contains("Infinite Scroll"));
    }

    @Test(priority = 5)
    public void TestCase3_1(){
        homePage.clickKeyPresses();
        keyPresses.actions_tab();
        assertTrue(keyPresses.getDisplayText().contains("You entered: TAB"));
    }

    @Test(priority = 6)
    public void TestCase3_2(){
        homePage.clickKeyPresses();
        keyPresses.actions_enter();
        assertTrue(keyPresses.getDisplayText().contains("You entered: ENTER"));
    }

    @Test(priority = 7)
    public void TestCase3_3(){
        homePage.clickKeyPresses();
        keyPresses.actions_backSpace();
        assertTrue(keyPresses.getDisplayText().contains("You entered: BACK_SPACE"));
    }

    @Test(priority = 8)
    public void TestCase3_4(){
        homePage.clickKeyPresses();
        keyPresses.actions_space();
        assertTrue(keyPresses.getDisplayText().contains("You entered: SPACE"));
    }
}




