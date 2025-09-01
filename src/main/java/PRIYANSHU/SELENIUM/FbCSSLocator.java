package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCSSLocator
{
    public static void main(String[] args)
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();

        WebElement email = driver.findElement(By.cssSelector("input#email"));    // id attribute
        email.sendKeys("fb idddd");
        WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")); // use class attribute
        password.sendKeys("9876543210");

    }
}
