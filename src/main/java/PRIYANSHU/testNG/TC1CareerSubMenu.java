package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1CareerSubMenu
{
    @Test
    public void submenu() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;

        String ExpectedURL = "https://www.orangehrm.com/en/company/careers";

        // Click on 'Company' menu
        driver.findElement(By.xpath("//a[text()='Company']")).click();

        // Click on 'Careers' submenu under 'Company'
        driver.findElement(By.xpath("//a[@href='/en/company/careers']")).click();
        String currentURL = driver.getCurrentUrl();

        Assert.assertEquals(currentURL,ExpectedURL,"Career submenu Testcae Fail.....");
        System.out.println("Career submenu Testcae pass.....");

        driver.quit();
    }
}
