package samrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM {
    ChromeDriver driver;

    public void options(String sub) {
        methoddriverjava md= new methoddriverjava();
        md.openDriver("https://www.orangehrm.com/");
        driver = md.driver;
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        String sub1 = sub.toLowerCase();
        sub1=sub1.replace(" ","-");

        String path = "//a[@href='/en/company/"+sub1+"']";
        WebElement we = driver.findElement(By.xpath(path));
        we.click();
    }
    public static void main(String[] args) {
        orangeHRM oc = new orangeHRM();
        oc.options("About Us");
    }
}