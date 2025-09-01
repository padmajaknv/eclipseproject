package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instalogin
{
    public static void main(String[] args)
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.instagram.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@name='username']"))
                .sendKeys("priyanshu219");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("147852369");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

}
