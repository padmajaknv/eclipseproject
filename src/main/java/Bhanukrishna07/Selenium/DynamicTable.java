package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicTable {
    void table() {
        OpenUrl ul = new OpenUrl();
        ul.url("https://practice.expandtesting.com/dynamic-table");
        ChromeDriver driver = ul.driver;
        //  Get all headers once
        List<WebElement> headers = driver.findElements(By.tagName("th"));
        int columnCount = headers.size();

       // Get total number of rows
        List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr"));
        int rowCount = allRows.size();
        // Re-fetch current row after refresh
        List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        for (int j = 0; j < columnCount; j++) {
            String header = headers.get(j).getText();
            String cellText = cells.get(j).getText();
            System.out.println(header + ": " + cellText);
        }
        driver.navigate().refresh();
        driver.quit();
    }
    public static void main(String[] args) {
        DynamicTable dt=new DynamicTable();
        dt.table();
        dt.table();
    }
}
