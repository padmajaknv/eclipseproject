package Sudharshan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Orange_hrm {
    void openorange(String y) {
        Open_url ol = new Open_url();
        ol.url("https://www.orangehrm.com/");
        ChromeDriver driver=ol.driver;
        driver = ol.driver;
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        List<WebElement> ele=driver.findElements(By.xpath("//a[contains(@href,'/en/company/')]"));
        for(int i=0;i< ele.size();i++){
            if(ele.get(i).getText().equalsIgnoreCase(y)){
                ele.get(i).click();
                break;

            }
        }
    }
    public static void main(String[] args) {
        Orange_hrm or=new Orange_hrm();
        or.openorange("About Us");
    }
}