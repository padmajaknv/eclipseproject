package haraprasad.TestNG;

import haraprasad.Selenium.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class dynamicTable {
    @Test
    public void table() throws Exception{
        commonDriver cd=new commonDriver();
        cd.openDriver("https://practice.expandtesting.com/dynamic-table");
        ChromeDriver driver=cd.driver;
        List<WebElement> head=driver.findElements(By.xpath("//th"));
        List<WebElement> data=driver.findElements(By.xpath("//td"));
        int count=head.size();
        int a=0,b=0;
        for(int i=a;i<data.size();i++){
            if(b==count){
                b=0;
                System.out.println("____________");
            }
            for(int j=b;j<head.size();j++){
                String header=head.get(j).getText();
                String row=data.get(i).getText();
                System.out.println(header+":"+row);
                break;
            }
            a++;
            b++;
        }
        driver.quit();
    }
}
