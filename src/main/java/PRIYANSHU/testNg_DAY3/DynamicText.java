package PRIYANSHU.testNg_DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicText
{
    @Test
    public void getText() throws Exception
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("file:" + System.getProperty("user.dir") + "\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();

        driver.findElement(By.xpath("//button[text()='Click the button']")).click();
        WebElement text = driver.findElement(By.id("result"));

        String Result = "";
        while (Result.length() == 0)
        {
            Thread.sleep(1000);
            Result = text.getText();
            if (Result.length() > 0)
            {
                System.out.println("Result is : " + Result);
                break;
            }
        }
        driver.quit();
    }
}
