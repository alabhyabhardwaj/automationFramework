package com.automation.testClass;

import com.automation.driverManager.Driver;
import com.automation.pages.FlightsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by vikas.kumar1 on 27-12-2017.
 */

public class FlightsTest extends BaseTest {
    public FlightsPage flight;

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = Driver.getDriver();
        flight = new FlightsPage(driver);
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"sanity"})
    public void test1() throws Exception {
        Assert.assertTrue(true);
    }

    @Test(groups = {"sanity"})
    public void test2() throws Exception {
        Assert.assertTrue(false);
    }

}
