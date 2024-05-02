package CicekSepetiPageObjectModel.page;

import CicekSepetiPageObjectModel.base.BasePage;
import io.appium.java_client.AppiumDriver;

import static CicekSepetiPageObjectModel.constants.Constants.*;

public class SignInPage extends BasePage {

    AppiumDriver driver;


    public SignInPage(AppiumDriver driver){
        super(driver);
    }


    //1.case method
    public SignInPage leftCicekImage() throws InterruptedException {
        Thread.sleep(1000);
        click(CICEK_IMAGE);
        Thread.sleep(1000);
        return this;
    }

    //2.case method
    public SignInPage accountButton() throws InterruptedException {
        Thread.sleep(1000);
        click(ACCOUNT_BUTTON);
        Thread.sleep(1000);
        return this;
    }

    //3.case method
    public SignInPage signInButton() throws InterruptedException {
        Thread.sleep(1000);
        click(SIGN_IN_BUTTON);
        Thread.sleep(1000);
        return this;
    }


    //4.case method
    public SignInPage emailText() throws InterruptedException {
        Thread.sleep(1000);
        click(EMAIL_TEXT);
        Thread.sleep(1000);
        sendKeys(EMAIL_TEXT, "deneme123@hotmail.com");
        return this;
    }

    //5.case method
    public SignInPage password() throws InterruptedException {
        Thread.sleep(1000);
        click(PASSWORD);
        Thread.sleep(1000);
        sendKeys(PASSWORD, "deneme12300000");
        return this;
    }

    //6.case method
    public SignInPage firstLastName() throws InterruptedException {
        Thread.sleep(1000);
        click(FIRST_LAST_NAME);
        Thread.sleep(1000);
        sendKeys(FIRST_LAST_NAME, "Deneme Deneme");
        return this;
    }

    //7.case method
    public SignInPage checkboxOne() throws InterruptedException {
        Thread.sleep(1000);
        click(CHECKBOX_1);
        Thread.sleep(1000);
        return this;
    }

    //8.case method
    public SignInPage checkboxSecond() throws InterruptedException {
        Thread.sleep(1000);
        click(CHECKBOX_2);
        Thread.sleep(1000);
        return this;
    }

    //9.case method
    public SignInPage signInFinalButton() throws InterruptedException {
        Thread.sleep(1000);
        click(SIGN_IN_FINAL_BUTTON);
        Thread.sleep(1000);
        return this;
    }



}
