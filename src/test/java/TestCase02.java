
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TestCase02 {
    @Test
    @Description("Verify the title")
    public void vwoLoginTest(){
        //Selenium Arch
        //Write the code in any language -Python,Ruby,
        WebDriver driver = new ChromeDriver();

        //1.Create Session -> Box-> Connect with Browser via HTTP method
        //2.SessionID -> 16 alpha digit ->q9w8e78q9w8e78w9
        //3.driver-> ref-functions -> driver.get() ->HTTP Command ->open an url("")
        //4.driver.command()-> API request(GET,POST,PATCH) ->web driver w3c document
        //5.Flow/Architecture of Selenium 4
        // Code (java, python, C#) ->
        // w3c protocol (in built in browsers) ->
        // Servers(Chrome Drivers) ->
        // Chrome Browser ,Edge Browser ,
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    }
}
