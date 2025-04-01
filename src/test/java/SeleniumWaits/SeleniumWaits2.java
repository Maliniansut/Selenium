package SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits2 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));  // Reduced wait time
    }

    @Test
    @Description("Verify current URL after login")
    public void testPositive() {
        driver.get("https://app.vwo.com/#/login");

        // Enter login credentials
        driver.findElement(By.id("login-username")).sendKeys("maliniansut@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("123@Malini");
        driver.findElement(By.id("js-login-btn")).click();

        // Wait for a reliable element that confirms successful login
        WebElement loggedInUser= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-qa='lufexuloga']")));
        System.out.println("Login Successful! Dashboard Element Found: " + loggedInUser.getText());

        wait.until(ExpectedConditions.visibilityOf(loggedInUser));
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

