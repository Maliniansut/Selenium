package Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium06 {
    public static void main(String[] args){
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.get("https://github.com/Maliniansut/CucumberBDDAAPI");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit(); //this would close the whole browser at one go.
                       //session Id = null
        driver.close(); //this closes the current window but not the full  browser.
                        //session Id != null ,Error would be invalid sessionId.
    }
}
