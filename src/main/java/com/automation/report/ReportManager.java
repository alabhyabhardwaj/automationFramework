package com.automation.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * Created by vikas.kumar1 on 16-02-2018.
 */
public class ReportManager {

    private static ExtentReports extentReports;
    private static ExtentHtmlReporter extentHtmlReporter;
    private static ExtentTest extentTest;

    public static ExtentReports setExtentreports() throws Exception {
System.out.print("setExtentreports");
        if (extentReports != null) {
            return extentReports;
        }
        extentReports = new ExtentReports();
        extentReports.attachReporter(setExtentHtmlReporter());
        return extentReports;
    }

    public static ExtentHtmlReporter setExtentHtmlReporter() throws Exception {
        extentHtmlReporter = new ExtentHtmlReporter("System.getProperty(\"user.dir\") + \"//src//test//extentreport.html\"");
        extentHtmlReporter.config().setDocumentTitle("MMT Report");
        extentHtmlReporter.config().setChartVisibilityOnOpen(true);
        extentHtmlReporter.config().setReportName("Sanity Report");
        return extentHtmlReporter;    }

    public static ExtentTest getExtentTest  ( String testCaseName, String testCaseDisc) throws Exception{
        setExtentreports();
        System.out.print(testCaseName +" I am here "+testCaseDisc);
        System.out.print(testCaseName +"  "+testCaseDisc);
        extentTest = extentReports.createTest(testCaseName, testCaseDisc);
        return extentTest;
    }
}
