package testClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.CommonAPI;
import pageObjects.HomePage;
import pageObjects.WelcomePage;
import pageObjects.LoginPage;

public class LoginWithOrganizationFunctionality extends CommonAPI {
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
    public void clickLoginWithOrganization() {
        welcomePage.clickOnLogin();
        loginPage.clickOnOrganizationLogin();
    }

    @Test
    public void enterInvalidOrganizationEmail() {
        welcomePage.clickOnLogin();
        loginPage.clickOnOrganizationLogin();
        loginPage.enterOrganizationEmail("johndoe@gmail.com");
        loginPage.organizationLoginButton();

        }
    }




