package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCommentsPage extends BasePage {
    public NewCommentsPage(WebDriver driver) {
        super(driver);
    }
    public boolean verifyComments(){
        return driver.findElements(By.xpath("//div[@id = 'main']")).isEmpty();
    }
}
