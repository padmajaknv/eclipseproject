package PRIYANSHU.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5SpanishLanguage
{
    @Test
    public void span() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;

        String ExpectedURL = "https://www.orangehrm.com/es";

        WebElement dropdown =  driver.findElement(By.xpath("//select[@class='lan-details']"));
        dropdown.click();

        Select select = new Select(dropdown);
        select.selectByValue("/es");

        String currentURL =driver.getCurrentUrl();
        Thread.sleep(2000);

        Assert.assertEquals(currentURL,ExpectedURL,"spanish Languagetest case Fail......");
        System.out.println("spanish Language Testcase pass......");
        driver.quit();
    }
}
