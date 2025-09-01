package PRIYANSHU.testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class flyReturn
{
    @Test
    public void socialmedia() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
/// -------------------------------------- linkedin ----------------------------------------------------------
        // Scroll to LinkedIn logo and click on it
        WebElement linkedinLogo = driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
        Actions action = new Actions(driver);
        action.moveToElement(linkedinLogo).build().perform();
        linkedinLogo.click();

        Thread.sleep(2000);

/// -------------------------------------- facebook ----------------------------------------------------------
        WebElement facebookLogo = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
        action.moveToElement(facebookLogo).build().perform();

        facebookLogo.click();
        Thread.sleep(2000);
/// -------------------------------------- youtube ----------------------------------------------------------
        WebElement youtubeLogo = driver.findElement(By.xpath("//img[@alt='youtube logo']"));
        action.moveToElement(youtubeLogo).build().perform();

        youtubeLogo.click();
        Thread.sleep(2000);

        System.out.println("LinkedIn option is working properly......");
        System.out.println("facebook option is working properly......");
        System.out.println("youtube option is working properly......");
        driver.quit();
    }
}
