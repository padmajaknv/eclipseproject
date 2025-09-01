package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class test1_OHRM {
    ChromeDriver driver;

    @Test
    public void test1(){
        methodDriver md = new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver=md.driver;
        driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Book Your Free Demo"));
        driver.quit();
    }
}
