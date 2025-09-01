package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class window {
    @Test
    public void getText() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://practice.expandtesting.com/windows");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows=driver.getWindowHandles();
        ArrayList<String> win=new ArrayList<>();
        win.addAll(windows);
        driver.switchTo().window(win.get(1));
        System.out.println(driver.getTitle());
        WebElement text= driver.findElement(By.className("example"));
        System.out.println(text.getText());
        driver.close();
        Thread.sleep(2000);
        driver.quit();

    }
}
