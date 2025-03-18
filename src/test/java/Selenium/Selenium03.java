package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {
    @Test
    public void testMethod(){
        //Extension to Chrome Browser
        //youTube video -> ad Blocker Extension
        //By using Selenium
        /*Headless Mode Advantages:
        *1. For example: If I am running 10,000 Test Cases it is not necessary to see working of all th test cases so they can run in backend.
        *2.Faster than running test cases normally.
        *  */
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");  //in headless mode everything would be working at backend but nothing would be seen
        chromeOptions.addExtensions(new File("/home/appinventiv/IdeaProjects/SeleniumAutomation/extensions/extension.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle()); //with help of this in headless mode when nothing is running in front of our eyes
                                               // still it will print the title.

    }
}
