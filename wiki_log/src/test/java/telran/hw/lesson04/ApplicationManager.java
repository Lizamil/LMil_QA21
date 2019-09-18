package telran.hw.lesson04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    LoginHelper loginHelper;
    SearchHelper searchHelper;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginHelper=new LoginHelper(driver);
        searchHelper=new SearchHelper(driver);
        searchHelper.openSite("https://en.wikipedia.org");
    }

    public void stop() {
        driver.quit();
        driver = null;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public SearchHelper getSearchHelper() {
        return searchHelper;
    }
}
