package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC6fb
{
    @Test
    public void fb() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;

        String currentfbURL = driver.getCurrentUrl();

        String FbExpectedURL = "https://www.facebook.com/OrangeHRM";
        WebElement fbLogo =  driver.findElement(By.xpath("//img[@alt='facebook logo']"));
        Actions action = new Actions(driver);
        action.moveToElement(fbLogo).build().perform();
        fbLogo.click();
        Thread.sleep(2000);

        Assert.assertEquals(FbExpectedURL,currentfbURL,"fb option is working properly......");
        System.out.println("fb option is working properly......");
        driver.quit();
    }
}
