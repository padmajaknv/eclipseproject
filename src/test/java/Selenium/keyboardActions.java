package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://facebook.com/");
        ChromeDriver driver = cm.driver;
        System.out.println(driver);
        pageObjectModel_FB pfb = new pageObjectModel_FB();
//        fb_commonMethods fcm = new fb_commonMethods();
//        fcm.typeEmailInFB("Hello World!!!!");
        Actions actions = new Actions(driver);

        actions.sendKeys(driver.findElement(pfb.email),"Hello")
                .keyDown(Keys.CONTROL).sendKeys("a")     //Similar to ctrl+a
                .sendKeys("c").keyUp(Keys.CONTROL)
                .click((driver.findElement(pfb.password)))
                        .keyDown(Keys.CONTROL).sendKeys("v")
                .build().perform();

    }
}

/*
Type - sendKeys(String), sendKeys(WebElement,String)
Press a Key - keyDown(Keys)
Release a Key - keyUp(Keys)
 */