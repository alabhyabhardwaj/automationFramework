package com.automation.testClass;

import com.automation.driverManager.Driver;
import com.automation.listeners.Listners;
import com.automation.pages.FlightsPage;
import com.automation.testClass.BaseTest;
import com.aventstack.extentreports.Status;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by vikas.kumar1 on 04-04-2018.
 */
public class TestClass1 extends BaseTest{
    public FlightsPage flight;
    private Logger logger = Logger.getLogger(getClass().getName());

    @BeforeClass
    public void beforeClass() throws Exception {
        logger.info("In BeforeClass");
        driver = Driver.getDriver();
        flight = new FlightsPage(driver);
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"sanity"})
    public void TestCase_Vikas() throws Exception {
        logger.info("In TestCase_Vikas");
        Assert.assertTrue(true);
    }


    @Test(groups = {"sanity"})
    public void TestCase_Kumar() throws Exception {
        logger.info("In TestCase_Kumar");
        Assert.assertTrue(false);
    }



}
