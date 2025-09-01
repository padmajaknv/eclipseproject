package Sudharshan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    void draganddrop(){
        Open_url ul=new Open_url();
        ul.url("https://practice.expandtesting.com/drag-and-drop-circles");
        ChromeDriver driver=ul.driver;
        Actions act=new Actions(driver);
        WebElement destinationfile=driver.findElement(By.xpath("//div[@id='target']"));
        WebElement source_red= driver.findElement(By.xpath("//div[@class='red']"));
        WebElement source_green= driver.findElement(By.xpath("//div[@class='green']"));
        WebElement source_blue= driver.findElement(By.xpath("//div[@class='blue']"));
        act.dragAndDrop(source_red,destinationfile).build().perform();
        act.dragAndDrop(source_green,destinationfile).build().perform();
        act.dragAndDrop(source_blue,destinationfile).build().perform();
    }
    public static void main(String[] args) {
        DragAndDrop dd=new DragAndDrop();
        dd.draganddrop();
    }
}