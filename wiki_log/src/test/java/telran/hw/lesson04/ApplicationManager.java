package telran.hw.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        openSite("https://en.wikipedia.org");
    }

    public void stop() {
        driver.quit();
        driver = null;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void searchInWiki(String searchword) {
        type(By.name("search"), searchword);
        click(By.name("go"));
//        driver.findElement(By.name("search")).click();
//        driver.findElement(By.name("search")).clear();
//        driver.findElement(By.name("search")).sendKeys(searchword);
//        driver.findElement(By.name("go")).click();
    }

    public void openSite(String url) {
        driver.get(url);

    }

    public void fillFormLog(String username, String password) {
        type(By.name("wpName"), username);
        type(By.name("wpPassword"), password);

        click(By.name("wpRemember"));
        click(By.name("wploginattempt"));
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;

    }

    public void wikiLogin() {
        click(By.id("pt-login"));
        fillFormLog("Lmil","liza1978");
   }
}
