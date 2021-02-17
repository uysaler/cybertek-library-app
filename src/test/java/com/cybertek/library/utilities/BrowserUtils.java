package com.cybertek.library.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("somethings happened in sleep method");
        }

    }

    public static void hoover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void clickOn(WebElement element, int timeout) {
        final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(element)));
        element.click();
    }
    public static void waitForVisibility(WebElement element,int timeout){
        final WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static List<String> getElementsText(List<WebElement>list){
        List<String>elemTexts=new ArrayList<>();
        for(WebElement el:list){
           elemTexts.add(el.getText()) ;
        }
        return elemTexts;
    }
    public static WebElement waitForClickability(By loacator,int timeout){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeout);
        return wait .until(ExpectedConditions.elementToBeClickable(loacator));
    }

}
