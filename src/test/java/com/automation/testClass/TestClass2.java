package com.automation.testClass;

import com.automation.driverManager.Driver;
import com.automation.pages.FlightsPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by vikas.kumar1 on 04-04-2018.
 */
public class TestClass2 extends BaseTest{

    public FlightsPage flight;
    private  Logger logger = Logger.getLogger(getClass().getName());
    @BeforeClass
    public void beforeClass() throws Exception {
        logger.info("In beforeClass");
        driver = Driver.getDriver();
        flight = new FlightsPage(driver);
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"sanity"})
    public void TestCase_Vikas_Here() throws Exception {
        logger.info("TestCase_Vikas_Here");
        Assert.assertTrue(true);
    }


    @Test(groups = {"sanity"})
    public void TestCase_Vikas_There() throws Exception {
        logger.info("TestCase_Vikas_There");
        Assert.assertTrue(false);
    }


}
