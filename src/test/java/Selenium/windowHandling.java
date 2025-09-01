package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class windowHandling {
    public static void main(String[] args) throws Exception {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://facebook.com/");
        ChromeDriver driver = cm.driver;
        pageObjectModel_FB pfb = new pageObjectModel_FB();
        driver.findElement(pfb.metaPay).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        ArrayList<String> al = new ArrayList<>();
        al.addAll(windows);
        driver.switchTo().window(al.get(0));
        driver.findElement(By.id("email")).sendKeys("Hi");
        driver.findElement(By.id("pass")).sendKeys("0987654321");
        driver.switchTo().window(al.get(1));
//        driver.close();
        driver.quit();
    }
}
