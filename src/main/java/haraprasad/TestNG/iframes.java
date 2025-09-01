package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iframes {
    @Test
    public void frame() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://ui.vision/demo/webtest/frames/");
        ChromeDriver driver = cd.driver;
        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='350']")));
        WebElement select=driver.findElement(By.xpath("//span[text()='I am a human']"));
        actions.moveToElement(select).build().perform();
        select.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello!!");
        Thread.sleep(2000);
        driver.quit();
    }
}
