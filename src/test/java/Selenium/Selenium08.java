package Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium08 {
    /*
    * 1.Open app.vwo.com
    * 2.Print the title and get the current url
    * 3.Verify that app.vwo.com is correct url
    */
    @Test
    @Description("Verify the current url and title of vwo login page.")
    public void testAppVwoLogin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

    }
}
