package TestNG;

import Selenium.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {

    @Test
    public void handleAlerts() throws Exception{
        commonMethods cm = new commonMethods();
        cm.openDriver(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        driver.findElement(By.name("alert")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); //clicks on OK

        driver.findElement(By.name("confirm")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); //clicks on Cancel

        driver.findElement(By.name("prompt")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello World!!!!");
        driver.switchTo().alert().accept();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
    }

}
