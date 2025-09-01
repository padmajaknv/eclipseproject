package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) throws Exception {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().to("https://www.youtube.com/");
//        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//yt-formatted-string[text()='Live']")).click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//h1[@id='hero-title']")).click();
//        driver.findElement(By.xpath("//span[text()='Watch Live']")).click();
    }
}
