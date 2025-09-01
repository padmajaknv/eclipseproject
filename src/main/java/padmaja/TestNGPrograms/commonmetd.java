package padmaja.TestNGPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class commonmetd {
    public ChromeDriver driver;
    public void openDriver(String url){
        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
