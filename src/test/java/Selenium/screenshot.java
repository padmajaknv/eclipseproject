package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class screenshot {
    public static void main(String[] args) throws Exception{
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        TakesScreenshot ts = driver;
//        File ss = ts.getScreenshotAs(OutputType.FILE);
        WebElement element = driver.findElement(By.xpath("//img[contains(@src,'orange')]"));
        File ss = element.getScreenshotAs(OutputType.FILE);
        System.out.println(ss);
//        Date date = new Date();
//        long time =  date.getTime();
//        System.out.println(time);
        File dest = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\QTSS.jpg");
        FileUtils.copyFile(ss,dest);
    }
}
