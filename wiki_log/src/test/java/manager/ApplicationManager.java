package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    LoginHelper loginHelper;
    SearchHelper searchHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME))
            driver = new ChromeDriver();
        if (browser.equals(BrowserType.FIREFOX))
            driver = new FirefoxDriver();

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
