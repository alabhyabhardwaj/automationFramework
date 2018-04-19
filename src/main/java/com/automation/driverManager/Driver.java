package com.automation.driverManager;

import com.automation.propertyReader.PropertyFileReader;
import com.automation.utilites.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver webDriver;
    private static DesiredCapabilities ds;
    private static ChromeOptions options;
    public static WebDriverWait wait;

    private Driver() {
    }

    public static WebDriver getDriver() throws Exception {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", PropertyFileReader.getProperty("pathOfDriver"));
            setBrowserCapabilty();
            setOption();
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
            wait = new WebDriverWait(webDriver, 100);
        }
        return webDriver;
    }

    private static void setBrowserCapabilty() {
        ds = new DesiredCapabilities();
        ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    }

    private static void setOption() {
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }

    public static void close() {
        webDriver.close();
    }

    public static void quit() {
        webDriver.quit();
    }

    public static void getUrl() throws Exception{
        webDriver.get(PropertyFileReader.getProperty("url"));
        UtilityMethods.waitForPageLoad(webDriver);
    }

}
