package pl.skleptest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css = "li.top-account a")
    WebElement accountButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToRegistrationForm() {
        accountButton.click();
    }
}
