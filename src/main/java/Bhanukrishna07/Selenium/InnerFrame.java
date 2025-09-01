package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InnerFrame {
    @Test
    void selectDropdown()throws Exception{
        OpenUrl ul=new OpenUrl();
        ul.url("https://ui.vision/demo/webtest/frames/");
        ChromeDriver driver=ul.driver;
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        WebElement innerfrme=driver.findElement(By.xpath("//iframe[contains(@src,'viewform?embedded=true')]"));
        driver.switchTo().frame(innerfrme);

        driver.findElement(By.xpath("//div[@jsname='d9BH4c']")).click();
        WebElement yes=driver.findElement(By.xpath("//div[@data-value='Yes']"));
        if(yes.getText().equals("Yes")){
            yes.click();
        }

    }
}
