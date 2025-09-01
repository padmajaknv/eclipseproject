package padmaja.TestNG.Smoketestcases;
/*6)Scroll down the page, locate the “About Us” section, and click the “Careers” link
to verify the navigation.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoketestcase6 {
    @Test
    public void Scroll(){
        commondriverclass cm = new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        Actions actions = new Actions(driver);
        WebElement scrolldown = driver.findElement(By.xpath("//h5[text()='About Us']"));
        actions.moveToElement(scrolldown).build().perform();
        /*WebElement careers = driver.findElement(By.xpath("(//a[contains(@href,'/en/company/careers')])[3]"));
        careers.click();*/
        WebElement careerslink = driver.findElement(By.linkText("Careers"));
        actions.click(careerslink).perform();
        //careerslink.click();
        WebElement txt = driver.findElement(By.xpath("//h1[text()='Grow with OrangeHRM']"));
        String referencetxt = txt.getText();
        System.out.println(referencetxt);
        Assert.assertEquals(referencetxt,"Grow with OrangeHRM","Heading text does not match");
        System.out.println("Test case pass");
        driver.quit();
    }
}
