package smruti.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import smruti.methodDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindow {
    ChromeDriver driver;

    @Test
    public void iframe() throws InterruptedException {
        methodDriver md = new methodDriver();
        md.openDriver("https://practice.expandtesting.com/windows");
        driver = md.driver;
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Set<String> tabs = driver.getWindowHandles();
        System.out.println(tabs);
        System.out.println(driver.getTitle());
        ArrayList<String> al = new ArrayList<>();
        al.addAll(tabs);
        driver.switchTo().window(al.get(1));
        String s = driver.findElement(By.tagName("h1")).getText();
        System.out.println(s);
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}
