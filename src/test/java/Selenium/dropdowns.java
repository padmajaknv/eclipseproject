package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class dropdowns {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Select month = new Select(driver.findElement(By.id("month")));
        Select year = new Select(driver.findElement(By.id("year")));

        day.selectByValue("15");
        month.selectByIndex(7);
        year.selectByVisibleText("1947");

//        day.isMultiple();
//        day.deselectByValue("15");
//        System.out.println(day.getFirstSelectedOption().getText());
//        List<WebElement> options = month.getOptions();
//        for(WebElement w : options){
//            System.out.println(w.getText());
//        }
    }
}
