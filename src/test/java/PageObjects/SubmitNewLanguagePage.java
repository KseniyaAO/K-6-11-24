package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class SubmitNewLanguagePage extends BasePage {
    private static final String SubManuLanguageSNL = "SUBMIT NEW LANGUAGE";

    public SubmitNewLanguagePage(WebDriver driver) {
        super ( driver );
    }

    private List<WebElement> getSubMenuLanguage() {
        List<WebElement> elem = driver.findElements ( By.xpath ( "//ul[@id='menu']/li/a" ) );
        System.out.println ( elem.size ( ) );
        return elem;
    }

    public boolean verifySubMenuItem() {
        for (int i = 0; i < getSubMenuLanguage ( ).size ( ); i++) {
            if (getSubMenuLanguage ( ).get ( i ).getText ( ).equalsIgnoreCase ( SubManuLanguageSNL )) {

            }
            return true;
        }
        return false;
    }

    public WebElement button() {
        By subLangButton = By.xpath ( "//input[@value='Submit Language']" );
        WebElement submitButtonLanguage = driver.findElement ( subLangButton );
        return submitButtonLanguage;
    }

    public WebElement getTexEr() {
        By errorMessage = By.xpath ( "//p[contains(@style,'border: 1px solid red; ')]" );
        return driver.findElement ( errorMessage );
    }
    public boolean verifyErrorMessage() {
        button ( ).click ( );
        return getTexEr ( ).getText ( ).equals ( "Error: Precondition failed - Incomplete Input." );
    }
    public boolean verifyErrorPFIIList() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//input[@name='submitlanguage']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int submit = button.getLocation().getY();
        for (int i = 0; i < submit; i += 20) {
            js.executeScript("window.scrollTo(0," + i + ")");
            Thread.sleep(50);
        }
//        WebElement button = driver.findElement(By.xpath("//input[@name='submitlanguage']"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        int submit = button.getLocation().getY();
////        js.executeScript("arguments[0],scrollIntoView({behavior:'smooth',block:'center;,inline:'center'};",button);
//        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", button);
//        //Нажимаю на кнопку  чтобы получить текст ошибки
        button().click();


        String errMessage = driver.findElement(By.xpath("//*[contains(@style,'border: 1px solid red; ')]")).getText().trim();
        String[] arrWordErr = errMessage.split(" ");
        //Преобразовываю массив строк в список
        List<String> errMessageList = Arrays.asList(arrWordErr);
        List<String> keywords = Arrays.asList("Error:", "Precondition", "Incomplete", "Input.", "failed", "-");

        boolean result = true;
        if (errMessageList.size() != keywords.size()) {
            result = false;
        } else {
            for (int i = 0; i < keywords.size(); i++) {
                boolean keywordFound = false;
                for (int j = 0; j < errMessageList.size(); j++) {
                    if (errMessageList.get(i).equals(keywords.get(j))) {
                        keywordFound = true;
                        break;
                    }
                }
                if (!keywordFound) {
                    result = false;
                    break;
                }
            }
            if (!errMessage.contains(".") || !errMessage.contains(":") || !errMessage.contains("-")) {
                result = false;
            }
        }
        return result;
    }
    private List <WebElement> ImportantMessage(){
        List<WebElement> elem = driver.findElements ( By.xpath ( "//div[@id='main']//ul/li") );
        return elem;
    }
    private List <WebElement> ImportantMessage2(){
        return driver.findElements ( By.xpath ( "//div[@id='main']//ul/li") );
    }
    public boolean verifyImportantMessage() {
        return ImportantMessage ().get(0).getText().equals("IMPORTANT: Take your time! " +
                "The more carefully you fill out this form (especially the language name and description)," +
                " the easier it will be for us and the faster your language will show up on this page. " +
                "We don't have the time to mess around with fixing your descriptions etc." +
                " Thanks for your understanding.");
    }
}




