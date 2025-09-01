package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3FreeTrial
{
    @Test
    public void Trial() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;

        String ExpectedURL= "https://www.orangehrm.com/en/30-day-free-trial";
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='30-Day Free Trial']")).click();
        String currentURL = driver.getCurrentUrl();

        Assert.assertEquals(currentURL,ExpectedURL,"30-Day Free Trial TestCase Fail.....");
        System.out.println("30-Day Free Trial TestCase Passed...");

        driver.quit();
    }
}
