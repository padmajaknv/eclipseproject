package padmaja.TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iframe {
    @Test
    public void frame() throws InterruptedException{
            commonmetd cm = new commonmetd();
            cm.openDriver(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
            ChromeDriver driver = cm.driver;
            driver.get("https://ui.vision/demo/webtest/frames/");
            driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='650']")));
            Actions actions = new Actions(driver);
            WebElement scroll = driver.findElement(By.xpath("//span[text()='How do you plan to use the software?']"));
            actions.moveToElement(scroll).build().perform();
            driver.findElement(By.xpath("//span[text()='I am a human']")).click();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
            driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello!!");
            Thread.sleep(2000);
            driver.quit();
    }

}
