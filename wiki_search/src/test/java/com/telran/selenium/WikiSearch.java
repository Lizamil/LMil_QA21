package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WikiSearch {
    WebDriver wd;


    public void clickk(String url, String searchword) {
        wd=new FirefoxDriver();
        wd.get(url);
        wd.findElement(By.name("search")).click();
        wd.findElement(By.name("search")).clear();
        wd.findElement(By.name("search")).sendKeys(searchword);
        wd.findElement(By.name("go")).click();
    }
 /*
@Test
    public void wikiSearch() throws InterruptedException {
    wd = new FirefoxDriver();
    wd.navigate().to("https://en.wikipedia.org/wiki");
    wd.findElement(By.name("search")).click();
    wd.findElement(By.name("search")).clear();
    wd.findElement(By.name("search")).sendKeys("Gagarin");
    wd.findElement(By.name("go")).click();
    Thread.sleep(7000);
    wd.quit();
}*/
  @Test
    public void wikiSearch2() throws InterruptedException {
      clickk("https://en.wikipedia.org/wiki","Gagarin");
      Thread.sleep(10000);
     wd.quit();
  }



    }

