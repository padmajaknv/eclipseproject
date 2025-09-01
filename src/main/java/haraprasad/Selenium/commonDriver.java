package haraprasad.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class commonDriver {
    public ChromeDriver driver;

    public void openDriver(String url) {
        String os = System.getProperty("os.name").toLowerCase();
        String driverPath = "";

        if (os.contains("win")) {
            driverPath = System.getProperty("user.dir") + "\\chromedriver.exe";
        }
        else if (os.contains("mac")) {
            driverPath = System.getProperty("user.dir")+"/chromedriver";
        }
        else {
            throw new RuntimeException("Unsupported operating system: " + os);
        }
//        String driverPath = System.getProperty("user.dir") + "/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
