package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import java.time.Duration;

public class SeleniumWaits1 {
    @Test
    @Description("Verify current URL")
    public void testPositive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Enter login credentials
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();

        // Explicit Wait for error message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement error_msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        // Print the error message to verify
        System.out.println("Error message: " + error_msg.getText());

        // Close browser
        driver.quit();
    }
}
