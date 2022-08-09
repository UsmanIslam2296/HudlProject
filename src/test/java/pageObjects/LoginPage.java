package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageBase.AppBasePage;

public class LoginPage extends AppBasePage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "logIn")
    private WebElement loginButton;
    @FindBy(xpath = "//p[@data-qa-id=\"error-display\"]")
    private WebElement notRecognizeErrorMessage;

    @FindBy (xpath = "//button[contains(text(),'Log In with an Organization')]" )
    private WebElement organizationLogin;

    @FindBy (xpath = "//input[@id=\"uniId_1\"]")
    private WebElement organizationEmail;

    @FindBy (xpath = "//body/div[@id='app']/section[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    private WebElement clickLogin;

    @FindBy (xpath = "//a[contains(text(),'Need help?')]")
    private WebElement needHelp;

    @FindBy (xpath = "//body/div[@id='app']/section[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement enterEmail;

    @FindBy (xpath = "//button[contains(text(),'Send Password Reset')]")
    private WebElement sendPasswordReset;

    public void enterEmail(String emailInput){
        sendKeyToEelement(email,emailInput);
    }
    public void enterPassword(String passwordInput){
        sendKeyToEelement(password, passwordInput);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public boolean isDisplayedErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        return wait.until(ExpectedConditions.visibilityOf(notRecognizeErrorMessage)).isDisplayed(); }

    public void clickOnOrganizationLogin() {clickOnElement(organizationLogin);}

    public void enterOrganizationEmail(String emailInput) {
        sendKeyToEelement(organizationEmail, emailInput);}

    public void organizationLoginButton() {clickOnElement(clickLogin);}

    public void clickNeedHelp() {clickOnElement(needHelp); }

    public void enterEmailToResetPassword() {sendKeyToEelement(enterEmail, "usmanislam2296@gmail.com"); }

    public void clickSendPasswordReset() {clickOnElement(sendPasswordReset); }
}