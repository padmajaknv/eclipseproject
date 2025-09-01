package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://tickets.paytm.com/bus/");
        ChromeDriver driver = cm.driver;
//        WebElement returnDate = driver.findElement(By.xpath("//div[text()='Return date']"));
//        boolean verify = returnDate.isDisplayed();
//        System.out.println(verify);
        driver.findElement(By.xpath("//label[@id='roundtrip']")).click();
//         try {
//            Thread.sleep(3000);
//        }catch (Exception e){}
//        verify = returnDate.isDisplayed();
//        System.out.println(verify);
        driver.findElement(By.xpath("//label[@id='oneway']")).click();
    }
}
