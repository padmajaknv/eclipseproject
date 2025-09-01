package Framework.Functions;

import Framework.Elements.homePagePFM;
import Framework.Elements.profilePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class loginMethods {

    ChromeDriver driver;

    public loginMethods(ChromeDriver cd){
        driver = cd;
    }

    public void navigateToLogin(){
        homePagePFM hp = PageFactory.initElements(driver, homePagePFM.class);
        hp.login.click();
    }

    public void login() throws Exception{
        homePagePFM hp = PageFactory.initElements(driver, homePagePFM.class);
        commons cm = new commons();
        String username = cm.readAPropertyFile("TC003_login","username");
        String password = cm.readAPropertyFile("TC003_login","password");
        hp.username.sendKeys(username);
        hp.password.sendKeys(password);
        hp.loginBtn.click();
    }

    public void validateLogin() {
        profilePage pf = PageFactory.initElements(driver, profilePage.class);
//        Assert.assertTrue(pf.logout.isDisplayed());
//        Assert.assertTrue(pf.welcomeMsg.isDisplayed());
        commons cm = new commons();
        cm.explicitWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(pf.logout));
        cm.explicitWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(pf.welcomeMsg));
        System.out.println("===== Logged in Successfully =====");
    }
}
