package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class test4_OHRM {
    ChromeDriver driver;

    @Test
    public void test4() {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver = md.driver;
        Select lang = new Select(driver.findElement(By.xpath("//select[@name='locale']")));
//        lang.selectByVisibleText("es");
        lang.selectByValue("/es");
//        driver.findElement(By.xpath("//option[@value='/es']")).click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.orangehrm.com/es"));
        driver.quit();
    }
}
//