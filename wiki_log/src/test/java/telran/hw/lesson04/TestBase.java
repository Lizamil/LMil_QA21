package telran.hw.lesson04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUP() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
    }
    @AfterMethod
    public void tearDown()  {
        driver.quit();

    }
}