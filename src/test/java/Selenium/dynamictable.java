package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import padmaja.TestNGPrograms.commonmetd;

import java.util.List;

public class dynamictable {
    @Test
    public void table() {
        commonmetd cm = new commonmetd();
        cm.openDriver("https://practice.expandtesting.com/dynamic-table");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        Actions act =new Actions(driver);
        WebElement scroll = driver.findElement(By.id("chrome-cpu"));
        act.moveToElement(scroll).build().perform();
        //driver.findElement(By.xpath("(//a[@href='/dynamic-table'])[1]")).click();
        List<WebElement> colelements = driver.findElements(By.xpath("//th"));
        List<WebElement> rowelements = driver.findElements(By.xpath("//td"));
        System.out.println(rowelements.size());
        System.out.println(colelements.size());
        int rowcount = 0, colcount = 0;
        for (int i = rowcount; i < rowelements.size(); i++) {
            if(colcount==5){
                colcount=0;
                System.out.println("--------------------------------");
            }
            for (int j = colcount; j < colelements.size(); j++) {
                System.out.println( String.valueOf(colelements.get(j).getText()) + ":" + String.valueOf(rowelements.get(i).getText()) );
                break;
            }
            rowcount++;
            colcount++;
        }
    }
}
