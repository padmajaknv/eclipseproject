package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Hello World!!!");
        String typed = email.getAttribute("value"); //fetches the value typed in input field
        System.out.println(typed);
    }
}