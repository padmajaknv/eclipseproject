package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ohrmTC4 {
    @Test
    public void TestCase4(){
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//input[@value='30-Day Free Trial']")).click();
        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.orangehrm.com/en/30-day-free-trial"));
        driver.quit();
    }
}
