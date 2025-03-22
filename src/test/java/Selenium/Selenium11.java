package Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

//We here are finding out
public class Selenium11 {
    @Test(groups = "M")
    @Description("Verify something")
    public void testVwoLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        //Print all the anchor tags on the app.vwo.com
        //anchor tag and print the getText
        List<WebElement> all_atags = driver.findElements(By.tagName("a"));

        all_atags.get(0).click(); //Start a free trail
        all_atags.get(1).click(); //Explore VWO's Enhanced Reports
        all_atags.size(); //it should show size as two

        for(WebElement element :all_atags){
            System.out.println(element.getText());
        }

        driver.close();
    }
}
