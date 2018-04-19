package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by vikas.kumar1 on 01-01-2018.
 */
public abstract class BasePage {
    //By uniqueElement = new By.ByXPath(".//*[@id='js-hp-widgetSection']//a[text()= 'Domestic']");

    public  WebDriver driver;
    WebDriverWait wait;
    By uniqueElement;

    BasePage(WebDriver webDriver, By uniqueElement) {
       this.uniqueElement = uniqueElement;
        driver = webDriver;
        wait = new WebDriverWait(driver, 30);
        isLoaded();
    }

    public void isLoaded() {
        wait.until(ExpectedConditions.presenceOfElementLocated(uniqueElement));
        if (driver.findElements(uniqueElement).size() < 0) {
            System.out.println("Going to close ");
        }
    }


}
