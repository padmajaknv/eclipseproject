package VarshithaUppalapati;

import org.openqa.selenium.chrome.ChromeDriver;

public class methodDriver {
    public ChromeDriver driver;

    public void openDriver(String Url) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(Url);
        driver.navigate().refresh();
        driver.manage().window().maximize();

    }
}