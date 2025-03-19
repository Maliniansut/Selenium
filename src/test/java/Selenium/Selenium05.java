package Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {
    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //Can also use proxy servers proxy.setHttpProxy("<HOST:PORT>");
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("121.40.185.42:1080");
        chromeOptions.setCapability("proxy",proxy);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://github.com/Maliniansut");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
