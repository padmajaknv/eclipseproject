package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM {
    public void option(String sub){
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        String a=sub.toLowerCase();
        a=a.replace(" ","-");
        driver.findElement(By.xpath("//a[@href='/en/company/"+a+"']")).click();
    }

    public static void main(String[] args) {
        orangeHRM or=new orangeHRM();
        or.option("About Us");
    }
}
