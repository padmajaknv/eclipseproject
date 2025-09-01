package Bhanukrishna07.TestNG;

import Bhanukrishna07.Selenium.OpenUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

public class OrangehrmCompanyHeader extends OpenUrl {
    @Test
    void headerCompany() throws Exception {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.orangehrm.com/");
        ChromeDriver driver=ul.driver;
        Actions act=new Actions(driver);
        WebElement company=driver.findElement(By.xpath("//a[text()='Company']"));
        act.moveToElement(company).build().perform();
        ul.readpropertyfile("Testdata");
        Properties prop=ul.prop;
        String x=prop.getProperty("menu");
        String xpath = "//a[text()='" + x + "']";
        WebElement ele=driver.findElement(By.xpath(xpath));
        ele.click();
        String currentUrl=driver.getCurrentUrl();

           if(currentUrl=="https://www.orangehrm.com/en/company/about-us"){
            WebElement text=driver.findElement(By.xpath("//h1[text()='About OrangeHRM']"));
            System.out.println(text.getText());
            Assert.assertTrue(text.isDisplayed(),"About OrangeHRM");
        }
           else if(currentUrl=="https://www.orangehrm.com/en/company/executive-profiles"){
            WebElement text=driver.findElement(By.xpath("//h1[text()='Executive Profiles']"));
            System.out.println(text.getText());
            Assert.assertTrue(text.isDisplayed(),"Executive Profiles");
        }  else   if(currentUrl=="https://www.orangehrm.com/en/company/press-releases"){
            WebElement text=driver.findElement(By.xpath("//h1[text()='Press Releases']"));
            System.out.println(text.getText());
            Assert.assertTrue(text.isDisplayed(),"Press Releases");
            driver.close();
        }  else   if(currentUrl=="https://www.orangehrm.com/en/company/news-articles"){
            WebElement text=driver.findElement(By.xpath("//h1[text()='Explore the News']"));
            System.out.println(text.getText());
            Assert.assertTrue(text.isDisplayed(),"Explore the News");
        }  else   if(currentUrl=="https://www.orangehrm.com/en/company/careers"){
            WebElement text=driver.findElement(By.xpath("//h1[text()='Grow with OrangeHRM']"));
            System.out.println(text.getText());
            Assert.assertTrue(text.isDisplayed(),"Grow with OrangeHRM");
        }
           driver.close();
    }
}
