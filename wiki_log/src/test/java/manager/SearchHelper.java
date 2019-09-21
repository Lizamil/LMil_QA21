package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends BaseHelper {

    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public void searchInWiki(String searchword) {
        type(By.name("search"), searchword);
        click(By.name("go"));
    }

    public boolean firstHeadingContainsSearchWord(String searchWord) {
        String title = getTextFromElement(By.xpath("//h1[@class='firstHeading']")).toLowerCase();
        return title.contains(searchWord.toLowerCase());
    }

    public String getTextFromElement(By locator) {
        return driver.findElement(locator).getText();
    }


}
