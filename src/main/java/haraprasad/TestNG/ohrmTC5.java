package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ohrmTC5 {
    @Test
    public void TestCase5() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver=cd.driver;
        WebElement Learn= driver.findElement(By.xpath("//div[@class='link-text']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Learn).build().perform();
        actions.click().build().perform();
        Thread.sleep(1500);
        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.orangehrm.com/en/solutions/people-management/hr-administration"));
        driver.quit();
    }
}
