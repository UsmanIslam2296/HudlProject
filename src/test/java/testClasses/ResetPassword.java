package testClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.CommonAPI;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class ResetPassword extends CommonAPI {
    WelcomePage welcomePage;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void initializePages() {
        welcomePage = new WelcomePage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void resetPassword() {
        welcomePage.clickOnLogin();
        loginPage.clickNeedHelp();
        loginPage.enterEmailToResetPassword();
        loginPage.clickSendPasswordReset();
    }
}

