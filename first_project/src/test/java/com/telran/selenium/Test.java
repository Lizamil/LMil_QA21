package com.telran.selenium;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Test extends TestBase{

    @org.testng.annotations.Test
    public void externalLinkCheckTest() throws InterruptedException {
        openSite("https://csssr.github.io/qa-engineer/");
        click(By.cssSelector("div.wrap:nth-child(1) section.requirements:nth-child(3) section.graphs:nth-child(2) div.graphs-errors > a:nth-child(1)")); //click on НАХОДИТЬ НЕСОВЕРШЕНСТВА
        String parentHandle= driver.getWindowHandle();
        click(By.cssSelector("div.wrap:nth-child(1) section.info:nth-child(4) div.info-errors aside:nth-child(4) ul:nth-child(2) li:nth-child(4) label:nth-child(2) > a:nth-child(1)")); //click on  Софт для быстрого создания скриншотов
     for (String childHandle: driver.getWindowHandles())
     {
         if(!childHandle.equals(parentHandle)){
             driver.switchTo().window(childHandle);
         }
     }
                Assert.assertTrue(isElementPresent(By.cssSelector("//a[contains(text(),'Home')]"))); //search button Home on https://getsharex.com/

        Thread.sleep(3000);
    }
   }