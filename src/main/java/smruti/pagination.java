package smruti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class pagination {
    ChromeDriver driver;
    Actions actions;

    public void amazon(String product) throws Exception {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.amazon.in/");
        driver = md.driver;
        driver.findElement(By.name("field-keywords")).sendKeys(product);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        WebElement needhelp = driver.findElement(By.xpath("//h2[text()='Need help?']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(needhelp).build().perform();
    }

    public int currentpage() throws Exception {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement page = driver.findElement(By.xpath("//span[@aria-current='page']"));
        return Integer.parseInt(page.getText());
    }

    public boolean LastPage() {
        List<WebElement> nSpan = driver.findElements(By.xpath("//span[contains(@class,'s-pagination-next')]"));
        return !nSpan.isEmpty();
    }

    public boolean FirstPage() {
        List<WebElement> pSpan = driver.findElements(By.xpath("//span[contains(@class,'s-pagination-previous')]"));
        return !pSpan.isEmpty();
    }

    public void next(int f) throws Exception {
        for (int i = 0; i < f; i++) {
            if (LastPage()) {
                System.out.println("reached last page");
                break;
            }
            int before = currentpage();
            driver.findElement(By.xpath("//a[contains(@aria-label,'Go to next page')]")).click();
            int after = currentpage();
            Assert.assertEquals(after, before + 1);
            WebElement needhelp = driver.findElement(By.xpath("//h2[text()='Need help?']"));
            Actions actions2 = new Actions(driver);
            actions2.moveToElement(needhelp).build().perform();
        }
    }

    public void previous(int b) throws Exception {
        for (int i = 0; i < b; i++) {
            if (FirstPage()) {
                System.out.println("reached first page");
                break;
            }
            int before = currentpage();
            driver.findElement(By.xpath("//a[contains(@aria-label,'Go to previous page')]")).click();
            int after = currentpage();
            Assert.assertEquals(after, before - 1);
            WebElement needhelp = driver.findElement(By.xpath("//h2[text()='Need help?']"));
            Actions actions1 = new Actions(driver);
            actions1.moveToElement(needhelp).build().perform();
        }
    }

    public static void main(String[] args) throws Exception {
        pagination pg = new pagination();
        pg.amazon("iphone");
        pg.next(2);
        pg.previous(2);
    }
}


/*create 2 methods  where it click on next button and previous page respeactively on the amazon page , move to one page and user can give the number of page will move by user
and then use assertion to check if it actually move to next page or previous page  or its on last page(pagination assignment)*/