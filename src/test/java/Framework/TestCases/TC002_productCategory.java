package Framework.TestCases;

import Framework.Functions.*;
import Framework.Variables.constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002_productCategory {
    ChromeDriver driver;
    commons cm=new commons();
    @BeforeMethod
    public void pre_condition() throws Exception{
        driver=cm.openDriver();
        cm.goToApp("https://demoblaze.com/");
    }
    @Test
    public  void TC002(){
        products pcm=new products(driver);
        pcm.productCategory(driver, constants.phone);
    }


    @AfterMethod
    public void post_condition(){
       // cm.quitDriver();
    }
}
