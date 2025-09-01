package VarshithaUppalapati;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
    ChromeDriver driver;
    public void sub(String name){
        methodDriver md=new methodDriver();
        md.openDriver("https://www.orangehrm.com/");
        driver=md.driver;
        driver.findElement(By.linkText("Company")).click();
        WebElement ele=driver.findElement(By.xpath("//a[text()='"+name+"']"));
        ele.click();
    }

    public static void main(String[] args) {
        orangehrm o=new orangehrm();
        o.sub("Press Releases");
    }
}
