package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class test5_OHRM {
    ChromeDriver driver;

    @Test
    public void test5() {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver = md.driver;
        WebElement footer = driver.findElement(By.xpath("//div[@class='footer-main-section']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(footer).build().perform();
        driver.findElement(By.xpath("(//a[contains(@href,'/company/careers')])[3]")).click();
        WebElement bigline = driver.findElement(By.xpath("//h1[text()='Grow with OrangeHRM']"));
        Assert.assertTrue(bigline.isDisplayed());

    }
}
