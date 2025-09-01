package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frame {
    @Test
    void frame() throws InterruptedException {
        OpenUrl ul=new OpenUrl();
        ul.url("https://ui.vision/demo/webtest/frames/");
        ChromeDriver driver=ul.driver;
        //Switch to frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        Actions act=new Actions(driver);

        //Switch to inner frame in frame3
        WebElement innerframe=driver.findElement(By.xpath("//iframe[@height='350']"));
        driver.switchTo().frame(innerframe);
        WebElement checkbox=driver.findElement(By.xpath("//span[text()='Web Testing']"));
        act.moveToElement(checkbox).click().perform();
        WebElement radiobutton=driver.findElement(By.xpath("//div[@aria-label='I am a human']"));
        act.moveToElement(radiobutton).build().perform();
        radiobutton.click();

        //Switch back to frame1
        driver.switchTo().defaultContent();
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        //Switch to frame 1

        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']"))
                .sendKeys("Frame1");
        Thread.sleep(2000);

        driver.quit();
    }
}
