package PRIYANSHU.testNg_DAY3;

import PRIYANSHU.testNG2.commonmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe
{
    @Test
    public void test() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://ui.vision/demo/webtest/frames/");
        ChromeDriver driver = cm.driver;

        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("Priyanshu Taria");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);


        WebElement inner = driver.findElement(By.xpath("//iframe[contains(@src, 'docs')]"));
        driver.switchTo().frame(inner);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='I am a human']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Choose']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}

