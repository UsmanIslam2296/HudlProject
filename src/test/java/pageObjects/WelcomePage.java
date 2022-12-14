package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageBase.AppBasePage;

public class WelcomePage extends AppBasePage {
    private WebDriver driver;
    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@data-qa-id=\"login\"]")
    private WebElement loginButton;
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

}
