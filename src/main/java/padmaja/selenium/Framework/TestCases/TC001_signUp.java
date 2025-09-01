package padmaja.selenium.Framework.TestCases;

import padmaja.selenium.Framework.Variables.constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import padmaja.selenium.Framework.Functions.*;
import org.testng.annotations.Test;

public class TC001_signUp {

    ChromeDriver driver;
    commons cm = new commons();


    @BeforeMethod
    public void preCondition(){
        driver = cm.openDriver();
        cm.goToApp("https://demoblaze.com/");
    }

    @Test
    public void TC001(){
        cm.navigateTopMenu(constants.signUp);
        signUpMethods sm = new signUpMethods(driver);
        sm.createAccount();
    }


    @AfterMethod
    public void postCondition(){
     //cm.quitDriver();
    }
}
