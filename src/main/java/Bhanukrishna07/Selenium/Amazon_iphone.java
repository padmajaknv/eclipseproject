package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Amazon_iphone extends OpenUrl {
    void search(String url,String filename, String key) throws Exception {
        OpenUrl ul=new OpenUrl();
        ul.url(url);
        ChromeDriver driver=ul.driver;
        WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String value = ul.readproperty(filename, key);
        searchbox.sendKeys(value);
        //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(3000);
        WebElement iphone=driver.findElement(By.xpath("//span[contains(text(),' 16pro max')]"));
        iphone.click();
        List<WebElement> iphones=driver.findElements(By.xpath("//h2//span[contains(text(),'iPhone')]"));
        System.out.println("count of iphone mobile:"+iphones.size());
    }
    public static void main(String[] args) throws Exception{
        Amazon_iphone ai=new Amazon_iphone();
        ai.search("https://www.amazon.in/","Testdata", "product");
    }
}
