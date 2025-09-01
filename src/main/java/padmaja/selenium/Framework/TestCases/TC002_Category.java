package padmaja.selenium.Framework.TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padmaja.selenium.Framework.Functions.commons;
import padmaja.selenium.Framework.Functions.phonescategoryMethods;
import padmaja.selenium.Framework.Variables.constants;

public class TC002_Category {

    ChromeDriver driver;
    commons cm = new commons();


    @BeforeMethod
    public void preCondition(){
        driver = cm.openDriver();
        cm.goToApp("https://demoblaze.com/");
    }

    @Test
    public void TC002() throws InterruptedException{

        cm.navigateToCategories(constants.phones,constants.phonescount);
        ChromeDriver cd=driver;;
        phonescategoryMethods sm = new phonescategoryMethods(driver);
        sm.phoneclick();

    }

    @AfterMethod
    public void postCondition(){
     //cm.quitDriver();
    }
}
