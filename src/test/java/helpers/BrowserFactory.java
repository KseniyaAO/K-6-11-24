package helpers;
import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import static org.openqa.selenium.remote.Browser.EDGE;
public class BrowserFactory {
    public static WebDriver getDriver(BrowserType browser) {
        switch (browser) {
            case EDGE:
                return getEdgeDriver ( );
//            case OPERA: return getOperaDriver();
            case FIREFOX:
                return getFirefoxDriver ( );
            default:
                return getChromeDriver ( );
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions ( );
        options.addArguments ( "window-size=1920,1080" );
//        options.addArguments("--headless");
        WebDriverManager.chromedriver ( ).setup ( );
        return new ChromeDriver ( options );
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions ( );
        options.addArguments ( "--width=1400" );
        options.addArguments ( "--height=1400" );
//        options.addArguments("--headless");
        WebDriverManager.firefoxdriver ( ).setup ( );
        return new FirefoxDriver ( options );
    }

    //    private static WebDriver getOperaDriver() {
//        WebDriverManager.operadriver().setup();
//        return new OperaDriver();
//    }
    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver ( ).setup ( );
        return new EdgeDriver ( );
    }
}