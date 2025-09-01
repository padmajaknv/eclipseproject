package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {


    @DataProvider(name = "sample", parallel = true) //dataprovider parallel execution
    public Object[][]  dataProv(){
        return new Object[][] {{"AA","BB"},{"CC","DD"},{"EE","FF"},{"GG","HH"}};
    }

    @Test(dataProvider = "sample")
    public void a(String username, String password){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
