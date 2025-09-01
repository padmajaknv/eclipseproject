package smruti.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class iFrame {
    ChromeDriver driver;

    @Test
    public void iframe(){
        methodDriver md = new methodDriver();
        md.openDriver("https://ui.vision/demo/webtest/frames/");
        driver = md.driver;
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'docs')]")));
        WebElement clear = driver.findElement(By.xpath("//span[text()='Clear selection']"));
        Actions action = new Actions(driver);
        action.moveToElement(clear).build().perform();
        driver.findElement(By.xpath("//span[text()='I am a human']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Smruti");
        driver.quit();
    }
}
