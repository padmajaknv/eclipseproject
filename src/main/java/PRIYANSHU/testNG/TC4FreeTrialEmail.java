package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4FreeTrialEmail
{
    @Test
    public void TrialEmail() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;

        Thread.sleep(2000);
        String ExpectedURL= "https://www.orangehrm.com/en/30-day-free-trial";

        // Find Email Entering Option
        WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']"));
        Email.sendKeys("priyanshutaria@gmail.com");

        // Click on 30 Days Free Trial
        driver.findElement(By.xpath("//input[@value='30-Day Free Trial']")).click();
        String currentURL = driver.getCurrentUrl();

        Assert.assertEquals(currentURL,ExpectedURL,"30-Day Free Trial with Email TestCase Fail.....");
        System.out.println("30-Day Free Trial with Email TestCase Passed...");
        driver.quit();
    }
}
