package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageBase.AppBasePage;

public class Signup extends AppBasePage {
    private WebDriver driver;

    public Signup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(text(),'Sign up')]")
    private WebElement clickSignup;

    @FindBy(xpath = "//a[@id='register_elite-contact']")
    private WebElement selectDivIProTeams;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='Phone']")
    private WebElement phoneNumber;

    @FindBy (xpath = "//select[@id='Country']")
    private WebElement selectCountry;

    @FindBy(xpath = "//select[@id='Primary_Language__c']")
    private WebElement selectLanguage;

    @FindBy (xpath = "//select[@id='State']")
    private WebElement selectState;

    @FindBy (xpath = "//input[@id='PostalCode']")
    private WebElement enterPostalZip;

    @FindBy(xpath = "//input[@id='Company']")
    private WebElement companyName;

    @FindBy(xpath = "//select[@id='organizationLevel_c']")
    private WebElement organizationLevel;

    @FindBy(xpath ="//select[@id='Team_Sport__c_contact']")
    private WebElement sportType;

    @FindBy (xpath = "//select[@id='Role__c']")
    private WebElement role;

    @FindBy (xpath = "//textarea[@id='message_c']")
    private WebElement message;


    public void signupButton() {
        clickOnElement(clickSignup);
    }

    public void clickProTeams() {
        clickOnElement(selectDivIProTeams);
    }

    public void enterFirstName(String nameInput) {
        sendKeyToEelement(firstName, nameInput);
    }

    public void enterLastName(String nameInput) {
        sendKeyToEelement(lastName, nameInput);
    }

    public void enterEmailAddress(String emailInput) {
        sendKeyToEelement(emailAddress, emailInput);
    }

    public void enterPhoneNumber(String phoneNumberInput) {
        sendKeyToEelement(phoneNumber, phoneNumberInput);
    }

    public void chooseCountry(){
        Select sel = new Select(selectCountry);
        sel.selectByVisibleText("United States");

    }

    public void chooseLanguage(){
        Select sel = new Select(selectLanguage);
        sel.selectByVisibleText("English");
    }

    public void chooseState(){
        Select sel = new Select(selectState);
        sel.selectByVisibleText("New York");
    }

    public void zipCode(String zipCodeInput) {sendKeyToEelement(enterPostalZip, zipCodeInput);}

    public void organizationName(String companyNameInput) {sendKeyToEelement(companyName, companyNameInput); }

    public void levelOfOrganization() {
        Select sel = new Select(organizationLevel);
        sel.selectByVisibleText("Professional");

    }

    public void typeOfSport() {
        Select sel = new Select(sportType);
        sel.selectByVisibleText("American Football");
    }

    public void personalRole() {
        Select sel = new Select(role);
        sel.selectByVisibleText("Athlete");
    }

    public void whatCanWeHelpYouWith(String enterMessageInput) {sendKeyToEelement(message, enterMessageInput);
    }



}
