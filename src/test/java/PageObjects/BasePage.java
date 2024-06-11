package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class BasePage {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(200));
    }

    public NewCommentsPage navigateToNewCommentsPage() {
        return null;
    }
}