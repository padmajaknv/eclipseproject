package padmaja.TestNG.Smoketestcases;
//1)check "Book a free demo" button is working or not.
// And redirecting to the correct page when clicked

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoketestcase1 {
    @Test
    void Bookademo(){
        commondriverclass cm=new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
        WebElement Fullname = driver.findElement(By.xpath("//input[@name='FullName']"));
        Assert.assertTrue(Fullname.isDisplayed(), "Full Name field should be displayed");
        System.out.println("Test Case Pass");
        driver.quit();
    }
}