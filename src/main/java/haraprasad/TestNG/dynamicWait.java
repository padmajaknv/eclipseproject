package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicWait {
    @Test
    public void text() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("file:"+System.getProperty("user.dir") + "/src/test/java/Selenium/test.html");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//button[text()='Click the button']")).click();
        WebElement text = driver.findElement(By.id("result"));
        String s=text.getText();
        while(s.length()==0){
            Thread.sleep(1000);
            if(text.getText().length()>0){
                s=text.getText();
                break;
            }
        }
        System.out.println(s);
        driver.quit();
    }
}
