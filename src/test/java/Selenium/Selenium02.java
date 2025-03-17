package Selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void testMethod(){
        /*Imp Concepts of OOPs->
        * Web Driver is an interface
        * interface InterfaceRef = new Class();
        * Two Concepts are used at the same time ->
        * 1. Inheritance
        * 2.Upcasting -> Dynamic Dispatch
        * */

        //Before using Selenium 4 we used to set up web driver path.
        //System.setProperty("webDriver.chrome.driver","/path/to/chrome/driver");

        /*SearchContent(I)-> Web Driver(I) -> Remote Web Driver(C) -> Chromium Driver(C) -> Chrome Driver(C)
        * Number and Utilities will increase when going from SearchContent to Chrome Driver */

        //Using of Search Context is not recommended as it would allow usage of only two functions.
        //Hence Web Driver is recommended as we can use all the functions and methods
        //SearchContext driver = new ChromeDriver(); //Dynamic Dispatch
        //driver.findElement();
        //driver.findElements();
        WebDriver driver = new ChromeDriver();  //Case 1 //Object creation of interface creation is not possible.
        RemoteWebDriver driver1 = new ChromeDriver(); //Case 2

        /*When both Case 1 and Case2 are allowed why do we prefer to use Web Driver?
        * As we would be able to run different drivers with WebDriver.
        * For Example if We are using Chrome Driver right now and want to use firefox driver after some time
        * I can do so with help of webDriver but this is not possible with specific drivers like RemoteWebDriver or EdgeDriver */
    }
}
