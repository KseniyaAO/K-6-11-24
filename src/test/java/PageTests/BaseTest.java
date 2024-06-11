package PageTests;
import enums.BrowserType;
import helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void  starUp() {
        driver = BrowserFactory.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown()  {
        driver.quit();
    }
}