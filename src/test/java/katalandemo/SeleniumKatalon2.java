package katalandemo;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumKatalon2 {
    //No usage of id
    @Test
    @Description("Verify the current url when no id is available for search.")
    public void katalonLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        //WebElement btnElement_xpath= driver.findElement(By.xpath("btn-make-appointment"));
        //btnElement_xpath.click();

        //By using xpath functions i.e contains ,if we don't have any random value and only make appointment then also we can find out with the help of contains.
        //WebElement btnElement_xpath = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        //        btnElement_xpath.click();

        WebElement btnElement = driver.findElement(By.partialLinkText("Make Appointment"));
        btnElement.click();

        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement usernameElement= driver.findElement(By.xpath("//input[@id = 'txt-username']"));
        usernameElement.sendKeys("John Doe");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@id = 'txt-password']"));
        passwordElement.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
