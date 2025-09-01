package smruti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    public void dd(String url) {
        methodDriver md = new methodDriver();
        md.openDriver(url);
        ChromeDriver driver = md.driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement circle1 = driver.findElement(By.className("red"));
        WebElement circle2 = driver.findElement(By.className("blue"));
        WebElement circle3 = driver.findElement(By.className("green"));
        WebElement target = driver.findElement(By.id("target"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(circle1, target).build().perform();
        actions.dragAndDrop(circle2, target).build().perform();
        actions.dragAndDrop(circle3, target).build().perform();
    }

    public static void main(String[] args) {
        DragAndDrop obj = new DragAndDrop();
        obj.dd("https://practice.expandtesting.com/drag-and-drop-circles");
    }
}

//dragAndDrop(source element, destination element)