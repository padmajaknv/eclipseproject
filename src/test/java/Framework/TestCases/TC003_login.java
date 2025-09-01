package Framework.TestCases;

import Framework.Functions.commons;
import Framework.Functions.loginMethods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC003_login {
    ChromeDriver driver;
    commons cm =  new commons();


    @BeforeMethod
    public void preCondition() throws Exception{
        driver = cm.openDriver();
        cm.goToApp("https://demoblaze.com/");
    }

    @Test
    public void TC003() throws Exception{
        loginMethods lm = new loginMethods(driver);
        lm.navigateToLogin();
        lm.login();
        lm.validateLogin();
    }

    @AfterMethod
    public void postCondition(){

    }
}
