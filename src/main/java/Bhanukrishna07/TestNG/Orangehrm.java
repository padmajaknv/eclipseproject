package Bhanukrishna07.TestNG;

import Bhanukrishna07.Selenium.OpenUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

public class Orangehrm {
    @Test
    void book_demo() throws Exception {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-contact-sales'])[2]")).click();
        String actualresult=driver.findElement(By.xpath("//h1[text()='Manage Your People and Operations in One Place']")).getText();
        System.out.println(actualresult);
        ul.readpropertyfile("Testdata");
        Properties prop=ul.prop;
        String expectedresult=prop.getProperty("bookdemo");
        Assert.assertEquals(actualresult,expectedresult);
        driver.close();
    }
  @Test
    void ContactSales()throws Exception{
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
        String actualresult=driver.findElement(By.xpath("//h1[text()='Contact Sales']")).getText();
        ul.readpropertyfile("Testdata");
        Properties prop=ul.prop;
        String expectedresult=prop.getProperty("contact");
        Assert.assertEquals(actualresult,expectedresult);
        driver.close();
    }
    //30 days freetrial
    @Test
    void freetrial() throws Exception {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        driver.findElement(By.xpath("//input[@name='EmailHomePage']"))
        .sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//input[@value='30-Day Free Trial']")).click();
        WebElement actualresult=driver.findElement(By.xpath("//h1[text()='Revolutionize Your Human Resource Management Experience!']"));
        Assert.assertTrue(actualresult.isDisplayed(),"Revolutionize Your Human Resource Management Experience!'");
        driver.close();
    }
    //language selection
    @Test
    void languageselection() throws InterruptedException {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='locale']"));
        Select sl=new Select(dropdown);
        sl.selectByVisibleText("Es"); //sl.selectByValue("/es"),   //sl.selectByVisibleText("Es")
        Thread.sleep(2000);

        driver.navigate().refresh();

        WebElement dropdownRefreshed = driver.findElement(By.xpath("//select[@name='locale']"));
        Select slRefreshed = new Select(dropdownRefreshed);
        slRefreshed.selectByIndex(0); //slRefreshed.selectByVisibleText("En");        //sl.selectByValue("/en");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.orangehrm.com/en");
        driver.close();
    }

}

