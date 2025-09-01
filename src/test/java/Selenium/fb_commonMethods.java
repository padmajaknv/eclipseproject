package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class fb_commonMethods{
//    fb_commonMethods fcm = new fb_commonMethods();
//    ChromeDriver driver = fcm.driver;
    pageObjectModel_FB pfb = new pageObjectModel_FB();
    ChromeDriver driver;

    fb_commonMethods(ChromeDriver driver){
        this.driver = driver;
    }

    public void typeEmailInFB(String email){
        driver.findElement(pfb.email).sendKeys(email);
    }
}
