package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropBy {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://emicalculator.net/");
        ChromeDriver driver = cm.driver;
        WebElement slider = driver.findElement(By.id("loanamountslider"));
        System.out.println(slider.getSize());
        Dimension d = slider.getSize();
        System.out.println(d.getHeight());
        System.out.println(d.getWidth());

        Dimension screenDim = driver.manage().window().getSize();
//        Dimension dim = new Dimension(1024,768);
//        driver.manage().window().setSize(dim);
        System.out.println(screenDim.getHeight());
        System.out.println(screenDim.getWidth());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,100,0)
                .build().perform();
        actions.dragAndDropBy(slider,-150,0)
                .build().perform();
    }
}
