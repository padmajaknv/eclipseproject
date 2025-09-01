package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class classTagName {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.findElement(By.className("nav-link-hed")).click();
        List<WebElement> inputElement = driver.findElements(By.tagName("input"));
        System.out.println(inputElement.size());
    }
}
