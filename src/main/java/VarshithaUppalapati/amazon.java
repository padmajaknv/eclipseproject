package VarshithaUppalapati;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class amazon {
    ChromeDriver driver;
    public void amazonsearch(String phones)throws Exception{
        methodDriver md=new methodDriver();
        md.openDriver("https://www.amazon.in");
        driver=md.driver;
        WebElement sear=driver.findElement(By.id("twotabsearchtextbox"));
        sear.sendKeys(phones);
         driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id=\"sac-suggestion-row-7\"]")).click();
        List<WebElement>mbl=driver.findElements(By.xpath("//h2[contains(@aria-label,'iPhone')]"));
        System.out.println(mbl.size());
    }
    public static void main(String[] args) throws Exception{
        amazon a=new amazon();
        a.amazonsearch("iphone 16pro max");
    }
}
