package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        Actions actions = new Actions(driver);
        actions.sendKeys(email, "Hello")
                .doubleClick().build().perform();
//        actions.contextClick(password).build().perform();
        System.out.println(driver.manage().window().getSize());
        System.out.println(email.getSize());
        actions.moveByOffset(150,120).contextClick().build().perform();
    }
}
/*
Left Click - click(), click(WebElement)
Right Click - contextClick(), contextClick(WebElement)
Double Click - doubleClick(),doubleClick(WebElement)
Scroll/Hover - moveByOffset(x,y), moveToElement(WebElement)
Drag and Drop - dragAndDrop(source element, destination element), dragAndDropBy(WebElement,x,y)
Click and Hold - clickAndHold()
Release - release()
 */
