package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSubMenu
{
    public static void main(String[] args) {
        OrangeHRMSubMenu obj = new OrangeHRMSubMenu();
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.findElement(By.xpath("//a[text()='Company']")).click();
        //.findElement(By.xpath("//a[text()='Company']")).click();
        obj.navigateCompany(driver, "Careers");
    }
    public void navigateCompany(ChromeDriver driver, String submenu)
    {
        WebElement submenuElement = driver.findElement(By.xpath("//a[text()='" + submenu + "']"));
        submenuElement.click();
    }

}
