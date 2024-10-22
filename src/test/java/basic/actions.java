package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.example.Main.driver;

public class actions {
    public static void main(String[] args) {
        WebElement element=driver.findElement(By.id(""));

        //create an actions object
        Actions actions=new Actions(driver);
        //Perform a hover action
        actions.moveToElement(element).perform();
        //Perform a right-click action
        actions.contextClick(element).perform();
        //drag and drop
        // Locate the source and target elements
//        WebElement sourceElement = driver.findElement(By.id("source"));
//        WebElement targetElement = driver.findElement(By.id("target"));
//        // Create an Actions object
//        Actions actions = new Actions(driver);
//        // Perform drag-and-drop
//        actions.dragAndDrop(sourceElement, targetElement).perform();

        /**
         * click() : clicks at the currrent mouse location
         * doubleclick() : performs a doubleclick at current mouse location
         * contextclick():
         * clickAndHold():
         * */

    }
}
