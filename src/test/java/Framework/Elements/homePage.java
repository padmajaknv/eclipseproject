package Framework.Elements;

import org.openqa.selenium.By;

public class homePage {
    public final By signUp = By.xpath("//a[text()='Sign up']");
    public final By signUpUsername = By.id("sign-username");
    public final By signUpPassword = By.id("sign-password");
    public final By signUpBtn = By.xpath("//button[text()='Sign up']");
    public final By numberofProducts=By.xpath("//a[@class='hrefch']");
}
