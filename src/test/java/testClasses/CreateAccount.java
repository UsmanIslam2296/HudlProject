package testClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageBase.CommonAPI;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Signup;
import pageObjects.WelcomePage;

public class CreateAccount extends CommonAPI {

    WelcomePage welcomePage;

    LoginPage loginPage;

    HomePage homePage;

    Signup signup;

    @BeforeMethod
    public void initializePages() {
        welcomePage = new WelcomePage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        signup = new Signup(driver);
    }

    @Test
    public void SignupWithHudl() {
        welcomePage.clickOnLogin();
        signup.signupButton();
        signup.clickProTeams();
        signup.enterFirstName("Usman");
        signup.enterLastName("Islam");
        signup.enterEmailAddress("uislam96@hotmail.com");
        signup.enterPhoneNumber("1234567890");
        signup.chooseCountry();
        signup.chooseLanguage();
        signup.chooseState();
        signup.zipCode("11221");
        signup.organizationName("Queens Bullies");
        signup.levelOfOrganization();
        signup.typeOfSport();
        signup.personalRole();
        signup.whatCanWeHelpYouWith("An opportunity at Hudl :)");

    }





}
