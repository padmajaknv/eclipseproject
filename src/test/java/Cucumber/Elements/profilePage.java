package Cucumber.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class profilePage {
    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logout;

    @FindBy(id = "nameofuser")
    public WebElement welcomeMsg;
}
