package com.automation.testClass;

import com.automation.driverManager.Driver;
import com.automation.listeners.Listners;
import com.automation.pages.FlightsPage;
import com.automation.testClass.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by vikas.kumar1 on 04-04-2018.
 */
public class TestClass1 extends BaseTest{
    public FlightsPage flight;

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = Driver.getDriver();
        flight = new FlightsPage(driver);
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"sanity"})
    public void TestCase_Vikas() throws Exception {
        Assert.assertTrue(true);
    }


    @Test(groups = {"sanity"})
    public void TestCase_Kumar() throws Exception {
        Assert.assertTrue(false);
    }



}
