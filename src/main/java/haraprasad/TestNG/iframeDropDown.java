package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class iframeDropDown {
    @Test
    public void dropdown() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://ui.vision/demo/webtest/frames/");
        ChromeDriver driver = cd.driver;
        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='350']")));
        WebElement scroll=driver.findElement(By.xpath("//span[text()='Next']"));
        actions.moveToElement(scroll).build().perform();
        driver.findElement(By.xpath("//span[text()='Choose']")).click();
        Thread.sleep(2000);
        List<WebElement> option=driver.findElements(By.xpath("//div[contains(@role,'option')]"));
        for(WebElement i:option){
            System.out.println(i.getText());
            if (i.getText().equalsIgnoreCase("Yes")) {
                i.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
