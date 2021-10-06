package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginHelper extends BaseHelper {

    public LoginHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFormLog(String username, String password) {
        type(By.name("wpName"), username);
        type(By.name("wpPassword"), password);

        click(By.name("wpRemember"));
        click(By.name("wploginattempt"));

    }


    public void wikiLogin() {
        click(By.id("pt-login"));
        fillFormLog("Lmil", "liza1978");
    }
}
