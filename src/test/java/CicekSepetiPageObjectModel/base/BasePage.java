package CicekSepetiPageObjectModel.base;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BasePage {

    AppiumDriver driver;


    public BasePage(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public void sendKeys(By by, String txt){
        findElement(by).sendKeys(txt);
    }

    public void click(By by){
        findElement(by).click();
    }

}
