package com.automation.listeners;

import com.automation.propertyReader.PropertyFileReader;
import com.automation.takeScreenShot.TakeScreenShot;
import com.automation.testClass.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.internal.IResultListener;

import java.io.File;

/**
 * Created by vikas.kumar1 on 20-02-2018.
 */
public class Listners extends BaseTest implements IResultListener {

    public static ExtentTest extentTest;
    public static String screenShotPath;
    public void onConfigurationSuccess(ITestResult itr) {

    }

    public void onConfigurationFailure(ITestResult itr) {

    }

    public void onConfigurationSkip(ITestResult itr) {

    }

    public void onTestStart(ITestResult result) {
    }

    public void onTestSuccess(ITestResult result) {

        extentTest = extentReport.createTest(result.getName());
        extentTest.log(Status.PASS, result.getName());
    }

    public void onTestFailure(ITestResult result) {
        try {
            screenShotPath = PropertyFileReader.getProperty("pathOfScreenShotwithRespectToReport")+TakeScreenShot.takeScreenShot(result.getName());
            extentTest = extentReport.createTest(result.getName());
            extentTest.log(Status.FAIL, result.getName());
            extentTest.log( Status.INFO, result.getThrowable());
            extentTest.fail("Screen for "+ result.getName()+ extentTest.addScreenCaptureFromPath(screenShotPath));
        }
        catch (Exception e ){

        }



    }

    public void onTestSkipped(ITestResult result) {
        extentTest = extentReport.createTest(result.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //extentTest = extentReport.createTest(result.getName());

    }

    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {
        System.out.print("onFinish");
       extentReport.flush();
    }
}
