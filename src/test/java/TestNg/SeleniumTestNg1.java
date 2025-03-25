package TestNg;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNg1 {
    //Best way to write test cases:
    //Always write efficient and single purpose test cases.
    //Advantage of using before and after test is that I can add number of test cases in between them.
    ChromeDriver driver;
    /*Atomic Test Cases
    * These are the type of test cases which don't have any dependency.
    * And they serve single purpose.*/
    @BeforeTest
    public void openBrowser(){
        //Create Session via API and SessionId is generated
        driver = new ChromeDriver();
    }
    //For every test case browser will open and then close
    //Now here each test case whether positive or negative is serving a single purpose like for positive it will open the current url and negative will throw an error.

    @Test
    @Description("Verify the current url")
    public void katalonUrl_positive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }
    @Test
    @Description("Verify the current url")
    public void katalonUrl_negative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
