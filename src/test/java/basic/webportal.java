package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class webportal {
    @Test
    public void titletest() throws InterruptedException{
        SoftAssert softAssert=new SoftAssert();
        String expectedtitle="Electronics,ghjkl Cars, Fashion, Collectibles & More | eBay";
        WebDriver we=new EdgeDriver();
        we.get("https://www.ebay.com/");
        String actualtitle=we.getTitle();
        softAssert.assertEquals(actualtitle,expectedtitle,"title verified");
        //System.out.println("Title verified");
        String expectedtext="Search";
        String actualtext=we.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        softAssert.assertEquals(actualtext,expectedtext,"text verified");
        System.out.println("Text verified");
        softAssert.assertAll();
        we.close();


    }
}
