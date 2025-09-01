package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Windowhandle {
    @Test
    void window() throws Exception{
        OpenUrl ul=new OpenUrl();
        ul.url("https://practice.expandtesting.com/windows");
        ChromeDriver driver=ul.driver;
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> url=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(url);
        driver.switchTo().window(al.get(1));
        WebElement ctext=driver.findElement(By.xpath("//h1[contains(text(),'Example of a new window page')]"));
        System.out.println("text from child window:"+ctext.getText());
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(al.get(0));
        WebElement ptext=driver.findElement(By.xpath("//h1[contains(text(),'Opening a new window page')]"));
        System.out.println("text from parent window:"+ptext.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
