package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class amazonIphone {
    public void search(String item) throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.amazon.in/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.name("field-keywords")).sendKeys(item);
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        List<WebElement> result=driver.findElements(By.xpath("//h2[contains(@aria-label,'iPhone')]"));
        System.out.println(result.size());
    }

    public static void main(String[] args) throws Exception{
        amazonIphone ip=new amazonIphone();
        ip.search("iphone");
    }
}
