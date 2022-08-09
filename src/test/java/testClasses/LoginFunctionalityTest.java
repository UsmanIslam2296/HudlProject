package testClasses;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.CommonAPI;
import pageObjects.HomePage;
import pageObjects.WelcomePage;
import pageObjects.LoginPage;

public class LoginFunctionalityTest extends CommonAPI {
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
   public void userIsNotAbleToLoginWithInvalidCredential() throws InterruptedException {
       welcomePage.clickOnLogin();
       loginPage.enterEmail(getEmailId());
       loginPage.enterPassword(getPassword());
       loginPage.clickOnLoginButton();
       Assert.assertTrue(loginPage.isDisplayedErrorMessage(), "Error message is not visible");


}
}


    //@Test
    //public void userShouldBeAbleToLoginWithValidCredential() throws InterruptedException {
        //welcomePage.clickOnLogin();
        //loginPage.enterEmail("usmanislam2296@gmail.com");//We can use a properties file to store any valid data
        //loginPage.enterPassword("");
        //loginPage.clickOnLoginButton();
        //Assert.assertEquals(homePage.getTitle(), "Home - Hudl");









