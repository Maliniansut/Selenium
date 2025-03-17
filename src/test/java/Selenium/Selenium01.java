package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium01 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.quit();

        /*Selenium Flow
        * 1.Create Session ID- unique id wqjtfweiquku
        * 2.Session -> Run commands ->GET Method -> Get W3c Protocol
        * 3.FirefoxDriver (Server) -> Tell the Browser
        * 4.Open Fresh Copy of Firefox browser and opens url -> https://app.vwo.com/#/login
        * 5.Driver command -> POST Request -> shut down the browser*/
    }
}
