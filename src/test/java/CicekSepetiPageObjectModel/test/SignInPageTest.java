package CicekSepetiPageObjectModel.test;
import CicekSepetiPageObjectModel.base.BaseTest;
import CicekSepetiPageObjectModel.page.SignInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest {

    SignInPage signInPage;

    @BeforeClass
    public void before(){

        signInPage = new SignInPage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);

        signInPage
                .leftCicekImage()
                .accountButton()
                .signInButton()
                .emailText()
                .password()
                .firstLastName()
                .checkboxOne()
                .checkboxSecond()
                .signInFinalButton();

    }

    @AfterClass
    public void after() throws InterruptedException {
        tearDown();
    }

}
