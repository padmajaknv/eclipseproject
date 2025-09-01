package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public void dragDrop(String url){
        commonDriver cd=new commonDriver();
        cd.openDriver(url);
        ChromeDriver driver=cd.driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement redC=driver.findElement(By.className("red"));
        WebElement greenC=driver.findElement(By.className("blue"));
        WebElement blueC=driver.findElement(By.className("green"));
        WebElement rectangle=driver.findElement(By.id("target"));
        Actions action=new Actions(driver);
        action.dragAndDrop(redC,rectangle).build().perform();
        action.dragAndDrop(blueC,rectangle).build().perform();
        action.dragAndDrop(greenC,rectangle).build().perform();
    }

    public static void main(String[] args){
        dragAndDrop dp=new dragAndDrop();
        dp.dragDrop("https://practice.expandtesting.com/drag-and-drop-circles");
    }
}
