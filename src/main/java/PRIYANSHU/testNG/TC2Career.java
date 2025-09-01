package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2Career
{
    @Test
    public void careerScroolDown() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        Thread.sleep(2000);

        String ExpectedURL = "https://www.orangehrm.com/en/company/careers";
        /// scrool down career
        WebElement career = driver.findElement(By.xpath("(//a[@href='/en/company/careers'])[3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(career).build().perform();

        career.click();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,ExpectedURL,"Career submenu Testcae Fail.....");
        System.out.println("Career submenu Testcae pass.....");

        driver.quit();
    }
}
