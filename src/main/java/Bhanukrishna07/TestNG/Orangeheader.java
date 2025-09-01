package Bhanukrishna07.TestNG;

import Bhanukrishna07.Selenium.OpenUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Orangeheader {
    //User should be able to navigate Testimonials page
    @Test
    void costomer() throws InterruptedException {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        Actions act=new Actions(driver);
        WebElement customer=driver.findElement(By.xpath("//a[text()='Why OrangeHRM']"));
        act.moveToElement(customer).build().perform();
        WebElement our_customer=driver.findElement(By.xpath("(//li[@class='sub-menu-title menu-title-row pt-2 pb-2'])[1]"));
        act.moveToElement(our_customer).build().perform();
        WebElement testimonials=driver.findElement(By.xpath("//h6//a[text()='Testimonials']"));
        act.moveToElement(testimonials).click().perform();
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6//a[text()='Case Studies']")));
        element.click();*/

        Thread.sleep(3000);
        WebElement actualresult=driver.findElement(By.xpath("//h1[text()='Testimonials']"));
        Assert.assertTrue(actualresult.isDisplayed(),"Testimonials");
        driver.close();
    }
}
