package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[text()='Home']")
    private WebElement homeButton;
    public String getTitle() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.visibilityOf(homeButton));
        return driver.getTitle();
    }
    public boolean isHomeButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.visibilityOf(homeButton));
        return homeButton.isDisplayed();
    }
}
