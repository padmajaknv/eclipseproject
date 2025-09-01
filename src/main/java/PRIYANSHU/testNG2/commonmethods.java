package PRIYANSHU.testNG2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class commonmethods
{
    public ChromeDriver driver;

    @Test
    public void openDriver(String url)
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
