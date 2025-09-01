/* write a method  to click comapny   and then choose option as per the user in orangehrm website */
package smruti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
    ChromeDriver driver;

    public void options(String sub) {
        methodDriver md = new methodDriver();
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
        OrangeHRM oc = new OrangeHRM();
        oc.options("About Us");
    }
}