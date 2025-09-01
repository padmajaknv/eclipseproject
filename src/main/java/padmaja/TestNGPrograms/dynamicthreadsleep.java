package padmaja.TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicthreadsleep {

    @Test
    public void dynamicthread() throws InterruptedException {
        commonmetd cm = new commonmetd();
        cm.openDriver(System.getProperty("user.dir") + "\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.id("button")).click();
        WebElement text = driver.findElement(By.id("result"));
        String textboxtext = text.getText();
        //String textboxtext = "";
        while (textboxtext.length() == 0) {
            Thread.sleep(1000);
            textboxtext = text.getText();
            if (textboxtext.length() > 0) {

                System.out.println(textboxtext);
                break;
            }
        }
        driver.quit();
    }
}
