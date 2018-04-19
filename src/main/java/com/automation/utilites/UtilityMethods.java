package com.automation.utilites;

import com.automation.driverManager.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by vikas.kumar1 on 01-01-2018.
 */
public class UtilityMethods {
    private static JavascriptExecutor js;
    private static boolean result = false;
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void explicitWait() throws Exception {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 30);
    }

    public static void waitForElement(WebElement wE) {
        wait.until(ExpectedConditions.visibilityOf(wE));
    }

    public static void sleep(int sleepValueInMillSec) throws Exception {
        Thread.sleep(sleepValueInMillSec);
    }

    public static boolean waitForPageLoad( WebDriver driver) throws Exception {
        result = false;
        js = (JavascriptExecutor) driver;
        long endTime = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < endTime) {
            result = (js.executeScript("return document.readyState")).equals("complete");
            if (result == false) {
                sleep(2000);
            }
        }
        return result;
    }

}
