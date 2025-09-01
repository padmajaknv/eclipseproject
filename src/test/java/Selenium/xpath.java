package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("Hello World!!!");
    }
}
