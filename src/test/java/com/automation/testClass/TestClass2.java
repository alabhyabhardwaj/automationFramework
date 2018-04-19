package com.automation.testClass;

import com.automation.driverManager.Driver;
import com.automation.pages.FlightsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by vikas.kumar1 on 04-04-2018.
 */
public class TestClass2 extends BaseTest{

    public FlightsPage flight;

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = Driver.getDriver();
        flight = new FlightsPage(driver);
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"sanity"})
    public void TestCase_Vikas_Here() throws Exception {
        Assert.assertTrue(true);
    }


    @Test(groups = {"sanity"})
    public void TestCase_Vikas_There() throws Exception {
        Assert.assertTrue(false);
    }


}
