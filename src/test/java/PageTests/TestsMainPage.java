package PageTests;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestsMainPage extends BaseTest {
    @Test
    public void testTitleNameVerification(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openBasePage();
        Assert.assertTrue(mainPage.verifyTitle());
    }
    @Test
    public void testLastMenuName() {
        MainPage mainPage = new MainPage (driver);
        mainPage.openBasePage ();
        Assert.assertTrue (mainPage.verifyLastMenuItem ());
    }
}