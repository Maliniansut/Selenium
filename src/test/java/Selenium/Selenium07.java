package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium07 {
    public static void main(String[] args) throws MalformedURLException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://bing.com"); //Cannot go back or forward using the get command

        //for navigating forward and backward use navigate().to() command
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
