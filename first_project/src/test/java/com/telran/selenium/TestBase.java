package com.telran.selenium;

import org.openqa.selenium.By;
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
        public void tearDown()  {
            driver.quit();

        }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;

    }

//    public void type(By locator, String text) {
//        click(locator);
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(text);
//    }

}
