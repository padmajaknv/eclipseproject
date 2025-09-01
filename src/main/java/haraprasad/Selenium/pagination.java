package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class pagination {
    ChromeDriver driver;
    Actions actions;
    public void amazon(String item) throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.amazon.in/");
        driver=cd.driver;
        driver.findElement(By.name("field-keywords")).sendKeys(item);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        actions = new Actions(driver);
        WebElement scroll=driver.findElement(By.xpath("//span[@class='a-size-medium-plus']"));
        actions.moveToElement(scroll).build().perform();
    }

    public int currentpage() throws Exception{
        Thread.sleep(2000);
        WebElement page=driver.findElement(By.xpath("//span[@aria-current='page']"));
        return Integer.parseInt(page.getText());
    }

    public void forward(int f) throws Exception{
        for(int i=0;i<f;i++){
            int before=currentpage();
            if(before==20){
                WebElement previous=driver.findElement(By.xpath("//span[contains(@class,'s-pagination-next')]"));
                String check=previous.getAttribute("aria-disabled");
                Assert.assertFalse(check.equals("true"));
            }
            driver.findElement(By.xpath("//a[contains(@aria-label,'Go to next page')]")).click();
            int after=currentpage();
            Assert.assertEquals(before+1,after);
            WebElement scroll=driver.findElement(By.xpath("//span[@class='a-size-medium-plus']"));
            actions.moveToElement(scroll).build().perform();
        }
    }

    public void backward(int b) throws Exception{
        for(int i=0;i<b;i++){
            int before=currentpage();
            if(before==1){
                WebElement previous=driver.findElement(By.xpath("//span[contains(@class,'s-pagination-previous')]"));
                String check=previous.getAttribute("aria-disabled");
                Assert.assertFalse(check.equals("true"));
                System.out.println("hello");
            }
            driver.findElement(By.xpath("//a[contains(@aria-label,'Go to previous page')]")).click();
            int after=currentpage();
            Assert.assertEquals(before-1,after);
            WebElement scroll=driver.findElement(By.xpath("//span[@class='a-size-medium-plus']"));
            actions.moveToElement(scroll).build().perform();
        }
    }

    public static void main(String[] args) throws Exception{
        pagination pg = new pagination();
        pg.amazon("iphone");
        pg.forward(1);
        pg.backward(2);
    }
}
