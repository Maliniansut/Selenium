package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium04 {
    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--window-size=800,900");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/Maliniansut");
        System.out.println(driver.getTitle());
        driver.quit();
        /*Options class gives multiple types of utilities:
        * 1.headless mode
        * 2.Start in maximized mode
        * 3.Window size can be defined
        * 4.addExtensions()
        * 5.addArguments() etc.*/

        //Difference between chromeOptions.addArguments("--start-maximized"); and driver.manage().window().maximize.
        //chromeOptions.addArguments("--start-maximized"); -> this is fast, when using chromeOptions direct conversation happens context and browser.
        //driver.manage().window().maximize -> this is slow ,whereas when using driver.manager() first context tells driver and then driver tells to browser.

    }
}
