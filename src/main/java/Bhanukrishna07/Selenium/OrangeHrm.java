package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrangeHrm {
    void openorange(String x) {
        OpenUrl ol = new OpenUrl();
        ol.url("https://www.orangehrm.com/");
        ChromeDriver driver = ol.driver;
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        List<WebElement> ele=driver.findElements(By.xpath("//a[contains(@href,'/en/company/')]"));
        for(int i=0;i< ele.size();i++){
            if(ele.get(i).getText().equalsIgnoreCase(x)){
                ele.get(i).click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        OrangeHrm or=new OrangeHrm();
        or.openorange("About Us");
    }
}