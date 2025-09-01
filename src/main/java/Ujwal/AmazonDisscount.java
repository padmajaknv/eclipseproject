package Ujwal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonDisscount {
    void discount() throws Exception {
        OpenUrl ul=new OpenUrl();
        ul.url("https://www.amazon.in/");
        ChromeDriver driver=ul.driver;
        String search=ul.readproperty("Testdata","product");
        WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        ele.sendKeys(search);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='iphone 16pro max']")).click();
        String sp=driver.findElement(By.xpath("(//span[text()='1,35,900'])[2]")).getText();
        String s=sp.replace(",","");
        System.out.println(s);
        String mp=driver.findElement(By.xpath("(//span[text()='₹1,44,900'])[2]")).getText();
        String dl=mp.replace("₹","").replace(",","");
        System.out.println(dl);
        int sp1=Integer.parseInt(s);
        int mp1=Integer.parseInt(dl);
        int diff=mp1-sp1;
        float per=(diff*100/mp1);
        System.out.println(per);
        String percentage=driver.findElement(By.xpath("(//span[text()='(6% off)'])[1]")).getText();
        String removeoff=percentage.replace("% off","").replace("(","").replace(")","");
        int result=Integer.parseInt(removeoff);
    }

    public static void main(String[] args) throws Exception {
        AmazonDisscount ad=new AmazonDisscount();
        ad.discount();

    }
}