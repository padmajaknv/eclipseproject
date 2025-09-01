package padmaja.selenium.Framework.Functions;

import padmaja.selenium.Framework.Elements.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class signUpMethods {

    ChromeDriver driver;

    homePage hp = new homePage();

    public signUpMethods(ChromeDriver cd){
        driver = cd;
    }

    public void createAccount(){
        commons cm = new commons();
        //cm.explicitWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(driver.findElement(hp.signUpUsername)));
        driver.findElement(hp.signUpUsername).sendKeys("QT930AMJuly2025-3");
        driver.findElement(hp.signUpPassword).sendKeys("0987654321");
        driver.findElement(hp.signUpBtn).click();
        //cm.explicitWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.alertIsPresent());
        String success = driver.switchTo().alert().getText();
        Assert.assertTrue(success.equals("Sign up successful."));
        driver.switchTo().alert().accept();
        System.out.println("===== Account Creation is Successful =====");
    }
}
