package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkPartialLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\QT-930AM-Jul2025\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement element = driver.findElement(By.linkText("Forgotten password?"));
        element.click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Ray-Ban")).click();
    }
}
