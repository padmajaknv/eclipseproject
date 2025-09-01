package smruti.TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import smruti.methodDriver;

public class dynamicthread {

        @Test
        void getText() throws Exception {
            methodDriver md=new methodDriver();
            md.openDriver("file:"+System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
            ChromeDriver driver=md.driver;
            driver.findElement(By.xpath("//button[text()='Click the button']")).click();
            String s = "";
            while (s.length() == 0) {
                try {
                    WebElement result = driver.findElement(By.xpath("//p[text()='Hello World!!!']"));
                    Thread.sleep(1000);
                    if (result.getText().length() > 0) {
                        s = result.getText();
                        break;
                    }
                } catch (Exception e) {}
            }
            System.out.println(s);
            driver.quit();
        }
}

