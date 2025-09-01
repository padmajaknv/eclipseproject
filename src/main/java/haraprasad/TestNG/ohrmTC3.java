package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ohrmTC3 {
    @Test
    public void TestCase3(){
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//option[@value='/es']")).click();
        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.orangehrm.com/es"));
        driver.quit();
    }
}
