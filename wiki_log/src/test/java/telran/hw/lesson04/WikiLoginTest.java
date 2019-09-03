package telran.hw.lesson04;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase {

    @Test
    public void wikiLogin() throws InterruptedException {
        click(By.id("pt-login"));

        type(By.name("wpName"), "Lmil");
        type(By.name("wpPassword"), "liza1978");

        click(By.name("wpRemember"));
        click(By.name("wploginattempt"));

        click(By.id("pt-notifications-notice"));

        Thread.sleep(8000);
            }


}
