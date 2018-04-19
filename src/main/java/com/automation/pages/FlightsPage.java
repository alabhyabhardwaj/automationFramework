package com.automation.pages;

import com.automation.utilites.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vikas.kumar1 on 01-01-2018.
 */
public class FlightsPage extends BasePage {
    public By uniqueElemen = new By.ByXPath(".//*[@id='js-hp-widgetSection']//a[text()= 'Domestic']");

public static By getUniqueElement(){
    return new By.ByXPath(".//*[@id='js-hp-widgetSection']//a[text()= 'Domestic']");

}

    public FlightsPage(WebDriver driver) {
        super(driver,getUniqueElement());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id='header_tab_hotels']")
    public WebElement toCity;

    public void setToCity(String city)throws Exception{
        toCity.click();
        UtilityMethods.waitForPageLoad(driver);
    }




}
