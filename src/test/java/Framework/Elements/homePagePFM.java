package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class homePagePFM {

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login;

    @FindBy(id = "loginusername")
    public WebElement username;

    @FindAll({
            @FindBy(id="loginpassword"),
            @FindBy(xpath="//input[@id='loginpassword']")
    })
    public WebElement password;

    @FindBys({
            @FindBy(xpath = "//button[@onclick = 'logIn()']"),
            @FindBy(xpath = "//button[text()='Log in']")
    })
    public WebElement loginBtn;
}
