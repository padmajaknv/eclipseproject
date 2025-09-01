package Akhil.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Discount {
        void discount() throws Exception {
            OpenUrl ul=new OpenUrl();
            ul.url("https://www.amazon.in/");
            ChromeDriver driver=ul.driver;
            String search=ul.readproperty("Testdata","product");
            WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            ele.sendKeys(search);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@aria-label='iphone 16pro max']")).click();
            String sprice=driver.findElement(By.xpath("(//span[text()='1,35,900'])[2]")).getText();
            String s=sprice.replace(",","");
            System.out.println(s);
            String mprice=driver.findElement(By.xpath("(//span[text()='₹1,44,900'])[2]")).getText();
            String dl=mprice.replace("₹","").replace(",","");
            System.out.println(dl);
            int sp=Integer.parseInt(s);
            int mp=Integer.parseInt(dl);
            int diff=mp-sp;
            float per=(diff*100/mp);
            System.out.println(per);
            String percen=driver.findElement(By.xpath("(//span[text()='(6% off)'])[1]")).getText();
            String removeoff=percen.replace("% off","").replace("(","").replace(")","");
            int result=Integer.parseInt(removeoff);

        }

        public static void main(String[] args) throws Exception {
            Amazon_Discount ad=new Amazon_Discount();
            ad.discount();

        }
    }

