package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement element = driver.findElement(By.xpath("//a[@title='Hindi']"));
        String text = element.getText();
        System.out.println(text);
    }
}
