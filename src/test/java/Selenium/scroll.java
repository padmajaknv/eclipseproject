package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {
    public static void main(String[] args) throws Exception {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.amazon.in/");
        Thread.sleep(5000);
        ChromeDriver driver = cm.driver;
        WebElement imdb = driver.findElement(By.xpath("//h5[text()='IMDb']"));
        WebElement newReleases = driver.findElement(By.xpath("//div[@id='desktop-banner']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(imdb).build().perform();
        Thread.sleep(1000);
        Actions action1 = new Actions(driver);
        action1.moveToElement(newReleases).build().perform();
    }
}
