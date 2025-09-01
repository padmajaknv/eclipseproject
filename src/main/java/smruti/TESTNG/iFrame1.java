package smruti.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import smruti.methodDriver;

import java.util.List;

public class iFrame1 {
    ChromeDriver driver;

    @Test
    public void iframe() throws InterruptedException {
        methodDriver md = new methodDriver();
        md.openDriver("https://ui.vision/demo/webtest/frames/");
        driver = md.driver;
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'docs')]")));
        WebElement clear = driver.findElement(By.xpath("//span[text()='Next']"));
        Actions action = new Actions(driver);
        action.moveToElement(clear).build().perform();
        driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@role,'option')]"));
        System.out.println(options.size());
        for (WebElement choose:options){
            if (choose.getText().equalsIgnoreCase("yes")){
                choose.click();
                break;
            }
        }
        driver.quit();
    }
}




