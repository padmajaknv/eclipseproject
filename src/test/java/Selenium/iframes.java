package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        driver.findElement(By.id("text")).sendKeys("Hello World!!!");
//        driver.switchTo().frame(0); //based on index of iframe
//        driver.switchTo().frame("iFrame"); //based on the name attribute's value of the iframe tag
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Facebook']")));
        //based on the locator of the iframe tag
        driver.findElement(By.id("IframeText")).sendKeys("Hello World!!!");
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("text2")).sendKeys("Heyyyyy");

    }
}
