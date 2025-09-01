package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class test2_OHRM {
    ChromeDriver driver;

    @Test
    public void test2() {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver = md.driver;
        driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertTrue(title.equals("Get in Touch with OrangeHRM Sales | OrangeHRM HR Software"));
        driver.quit();
    }
}
