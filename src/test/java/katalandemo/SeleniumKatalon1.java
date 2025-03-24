package katalandemo;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

public class SeleniumKatalon1 {
    @Test
    @Description("Verify the current url.")
    public void katalonUrl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        //<a
        // id="btn-make-appointment"
        // href="./index.php#appointment"
        // class="btn btn-dark btn-lg"
        // >Make Appointment
        // </a>  Now here we have only three attributes which are key value pairs.

        WebElement btnElement = driver.findElement(By.id("btn-make-appointment"));
        //WebElement btnElement_CN = driver.findElement(By.className("btn.btn-dark.btn-lg"));
        //WebElement btnElement_PTEXT = driver.findElement(By.partialLinkText("Make"));
        //WebElement btnElement_LTEXT = driver.findElement(By.partialLinkText("Appointment"));
        //WebElement btnElement_Attribute_xPath = driver.findElement(By.xpath("//a[@href='./profile.php#.login']"));

        //assert the currentUrl https://katalon-demo-cura.herokuapp.com/profile.php#login
        btnElement.click();
        //wait for 2 seconds
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        //<input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value=""
        // autocomplete="off">

        WebElement usernameElement= driver.findElement(By.id("txt-username"));
        usernameElement.sendKeys("John Doe");

        //if not by id then using xpath and more than one element then used list here from java.util package
        /*List<WebElement> username_element = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        username_element.get(0).sendKeys("John Doe");*/ //1 because there are two elements present and we want to use the second element not zero element.

        WebElement passwordElement = driver.findElement(By.xpath("//input[@id = 'txt-password']"));
        passwordElement.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        Thread.sleep(3000);
        driver.quit();





    }
}
