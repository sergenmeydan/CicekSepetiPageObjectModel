package CicekSepetiPageObjectModel.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    static AppiumDriver appiumDriver = null;


    @BeforeClass
    public void setup(){
        try {

            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "Pixel 7 API 29");
            cap.setCapability("platformName", "Android");
            cap.setCapability("appium:udid", "emulator-5554");
            cap.setCapability("appium:platformVersion", "10.0");
            cap.setCapability("appium:appPackage", "com.ciceksepeti.ciceksepeti");
            cap.setCapability("appium:appActivity", "com.ciceksepeti.ciceksepeti.home.HomeActivity");
            cap.setCapability("appium:skipUnlock", "true");
            cap.setCapability("appium:noReset", "false");

            appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);


        } catch (MalformedURLException mx) {
            System.out.println("Incorrectly generated URL");
        }
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTest.appiumDriver = appiumDriver;
    }

    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        getAppiumDriver().quit();
    }

}
