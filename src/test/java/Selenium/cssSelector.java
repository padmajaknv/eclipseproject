package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.cssSelector("input#email"));
        email.sendKeys("Hello World!!!");
        WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
        password.sendKeys("0987654321");
        /*
        while using the class attribute, if the value contains spaces, replace the spaces
        with "."
         */
    }
}
