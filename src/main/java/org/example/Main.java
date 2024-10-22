package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


import java.sql.Driver;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String browser="chrome";
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
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
        driver.get("https://www.google.com");


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

//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//
//        String currentURL=driver.getCurrentUrl();
//        System.out.println(currentURL);
//
//        String titleofpage= driver.getTitle();
//        System.out.println(titleofpage);
//
//        String pageresource= driver.getPageSource();
//        System.out.println(pageresource);
//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
////        driver.close();
//
//        //List<WebElement> webElementList=  driver.findElement(By.xpath("//div[@class='inventory_list']/div"));
//        //System.out.println(webElementList);
//
//        driver.navigate().to("https://www.sugarcrm.com");
//        String windowhandle= driver.getWindowHandle();
//
//        System.out.println(windowhandle);
//        driver.findElement(By.xpath("//*[@id=\"slide-66e17d5c7cf6f\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
//        Set<String> windowhandles=driver.getWindowHandles();
//        System.out.println(windowhandles);


//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("password")).getAttribute("class");
        /**
         * getLocation()
         * getSize()
         * .getCssValue(" ")
         * getText()
         * getTagName()
         * .isDisplayed()
         * .isEnabled()
         * .isSelected()
         * */

        /**
         * handling dropdown
         * 1. find element by methods and store in string variable
         * 2.Select select= new Select(variable)
         * 3.use select methods like select.SelectByText(),SelectByVisible(),SelectByIndex();
         * */

        /*
         *selecting multi options in dropdown
         * WebElement ddown = driver.findElement(By.id("multi-select"));
         * Select select=new  Select(down);
             * select.selectByValue("california");
         * Thread.Sleep(2000);
         * select.selectByIndex(5);
         * List<WebElement> l=select.getAllSelectedOptions();
         * System.out.println(l.size());
         * select.deselectAll();
         *
         * select.deselectByIndex(5);
         * List<WebElement> l1=select.getAllSelectOptions();
         * System.out.println(l1.size());
         *
         * */

//        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
//        Thread.sleep(5000);
//
//        driver.switchTo().frame("singleframe");
//
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
//        Thread.sleep(5000);
//        //driver.quit();

        //select - singleselectdropdown
//        driver.get("");
//        WebElement singleselectDropdown = driver.findElement(By.id(""));
//        Select singleSelect=new Select(singleselectDropdown);
//
//        singleSelect.selectByIndex(2);
//        Thread.sleep(2000);
//        singleSelect.selectByValue("Thursday");
//        Thread.sleep(2000);
//
//        List<WebElement> options=singleSelect.getOptions();
//        System.out.println(options.get(3).getText());
        //System.out.println("list size:" + options.size());
//
//        for(WebElement ele:options){
//            System.out.println(ele.getText());
//        }
//        System.out.println(singleSelect.isMultiple());

        //Multi select
//        WebElement multiselectdropdown = driver.findElement(By.id(""));
//        Select multiselect= new Select(multiselectdropdown);
//        multiselect.isMultiple();
//        multiselect.selectByIndex(2);
//        multiselect.selectByValue("");
//        multiselect.selectByVisibleText("");
//        System.out.println(multiselect.getFirstSelectedOption().getText());
//        List<WebElement> allSelectedOptions = multiselect.getAllSelectedOptions();
//        for(WebElement ele:allSelectedOptions){
//            System.out.println(ele.getText());
//        }
//        Thread.sleep(2000);
//        multiselect.deselectByIndex(2);
//        Thread.sleep(2000);
//        multiselect.deselectAll();
    }
}

