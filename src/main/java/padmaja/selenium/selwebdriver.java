package padmaja.selenium;
/*Write a method to open a particular browser web driver when we call that method.*/

import org.openqa.selenium.chrome.ChromeDriver;

public class selwebdriver {

        String url(String urlname){
        String filepath=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", filepath + "\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(urlname);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        return urlname;
    }
    public static void main(String[] args) {
        selwebdriver sel=new selwebdriver();
        String text = sel.url("https://www.facebook.com/");
    }
}
