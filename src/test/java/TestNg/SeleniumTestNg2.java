package TestNg;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
//To fetch all the title when searched mac mini on ebay website.
public class SeleniumTestNg2 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    @Description("Verify the current URL and search titles")
    public void ebayUrl_positive() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id='gh-search-btn']"));
        searchButton.click();

        //WebElement searchPrice = driver.findElement(By.xpath("//span[contains(@class, 's-item__price')]"));
        //System.out.println("Price: " + searchPrice.getText());

        Thread.sleep(7000);

        // Locate all search result titles
        List<WebElement> searchTitles = driver.findElements(By.className("s-item__title"));
        //using className here as this website changes it's dom structure in different browser hence if we use xpath it will not find out title

        // Print how many titles were found
        System.out.println("Total Titles Found: " + searchTitles.size());

        // Print all search result titles
        for (WebElement title : searchTitles) {
            System.out.println("Title Text: " + title.getText());
        }

        driver.quit();
    }




}
//*[@id="item5a1b7af2cf"]