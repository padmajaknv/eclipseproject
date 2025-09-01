package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class instaLogin {
    @Parameters({"username","pass"})
    @Test
    public void login(String a,String b) throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.instagram.com/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.name("username")).sendKeys(a);
        driver.findElement(By.name("password")).sendKeys(b);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
