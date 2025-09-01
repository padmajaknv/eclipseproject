package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameId {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\QT-930AM-Jul2025\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("QT930AMJune2025");
        email.clear();
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("0123456789");
        driver.findElement(By.name("login")).click();
    }
}
