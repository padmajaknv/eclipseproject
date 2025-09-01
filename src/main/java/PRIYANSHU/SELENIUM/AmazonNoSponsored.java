package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonNoSponsored
{
    public static void main(String[] args)
    {
        int count = 0;

        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.amazon.in/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();

        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("i phone 16");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {}

        List<WebElement> products = driver.findElements(By.xpath("//span[contains(text(),'iPhone 16')][not(contains(@aria-label,'Sponsored'))]"));
        System.out.println("Total Number of iphones without Sponsored : " + products.size());
    }

}
