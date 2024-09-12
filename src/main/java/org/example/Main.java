package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


import java.sql.Driver;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String browser="edge";
    public static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equals("edge")) {
//            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equals("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
//            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        //using locators
        //driver.get("https://developer.salesforce.com/signup");
//        driver.findElement(By.className("form_input")).sendKeys("Testing");
//        driver.findElement(By.name("password")).sendKeys("idontknow");
//        driver.findElement(By.className("btn_action")).click();

        //driver.findElement(By.xpath("//input[@id=\"user-name\" and @class=\"form_input\"]")).sendKeys("pawan kalyan");
        //        driver.findElement(By.cssSelector("input#input")).sendKeys("wednesday");
        //Using relative locators
//        WebElement passwordfield=driver.findElement(By.name("password"));
//        driver.findElement(with(By.className("form_input")).above(passwordfield)).sendKeys("testing");
//
//        WebElement usernamefield= driver.findElement(By.className("form_input"));
//        driver.findElement(with(By.name("password")).below(usernamefield)).sendKeys("kabali");



//        driver.get("https://www.instagram.com/");
//        driver.findElement(By.tagName("input")).sendKeys("Testing");
//        driver.findElement(By.className("_aa48")).sendKeys("idontknow");
////        driver.findElement(By.className("btn_action")).click();

        /*
        * Basic webinterface methods
        * */

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL);

        String titleofpage= driver.getTitle();
        System.out.println(titleofpage);

        String pageresource= driver.getPageSource();
        System.out.println(pageresource);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//        driver.close();

        //List<WebElement> webElementList=  driver.findElement(By.xpath("//div[@class='inventory_list']/div"));
        //System.out.println(webElementList);

        driver.navigate().to("https://www.sugarcrm.com");
        String windowhandle= driver.getWindowHandle();

        System.out.println(windowhandle);
        driver.findElement(By.xpath("//*[@id=\"slide-66e17d5c7cf6f\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles);
    }
}

