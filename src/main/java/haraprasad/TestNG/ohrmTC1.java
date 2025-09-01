package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ohrmTC1 {
    @Test
    public void test1(){
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver=cd.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.orangehrm.com/en/book-a-free-demo"));
        driver.quit();
    }
}
