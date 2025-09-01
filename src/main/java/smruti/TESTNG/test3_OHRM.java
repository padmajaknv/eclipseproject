package smruti.TESTNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class test3_OHRM {
    ChromeDriver driver;

    @Test
    public void test3() {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver = md.driver;
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("smruti123@gmail.com");
        driver.findElement(By.xpath("//input[contains(@value,'30-Day')]")).click();
        WebElement form = driver.findElement(By.className("form-title"));
        Assert.assertTrue(form.isDisplayed());
        driver.quit();
    }
}




