package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void waitUntilElementIsClickAble(By by, int TimeInSeconds)
    // this explicitly wait method to allow some extra time before action
    {
        WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
        // create WebDriver Object
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static void javaScriptClickOnElement(By by) { //reusable method for click on element in case of other clickble method not work
        WebElement element = driver.findElement(by);
        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("arguments[0].click();", element);
    }
    public static String getURL(){return driver.getCurrentUrl();}

    public static void selectFromDropDownByVisibleText(By by,String text)// this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownByIndex(By by,int n) // this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByIndex(n);
    }
    public static void selectFromDropDownByValue(By by,String value) // this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

}
