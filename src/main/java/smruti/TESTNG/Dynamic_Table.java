package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import smruti.methodDriver;

import java.util.List;

public class Dynamic_Table {
    ChromeDriver driver;

    @Test
    public void iframe() throws InterruptedException {
        methodDriver md = new methodDriver();
        md.openDriver("https://practice.expandtesting.com/dynamic-table");
        driver = md.driver;
        WebElement test = driver.findElement(By.tagName("h4"));
        Actions action = new Actions(driver);
        action.moveToElement(test).build().perform();
        List<WebElement> columns = driver.findElements(By.tagName("th"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));

        for (WebElement r : rows) {
            List<WebElement> cells = r.findElements(By.tagName("td"));
            for (int i = 0; i < columns.size(); i++) {
                if (i < cells.size()) {
                    String header = columns.get(i).getText();
                    String value = cells.get(i).getText();
                    System.out.println(header + " : " + value);
                }
            }
            System.out.println("    ");
        }
        driver.quit();
    }
}
