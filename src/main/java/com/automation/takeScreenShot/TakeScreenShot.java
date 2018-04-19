package com.automation.takeScreenShot;

import com.automation.driverManager.Driver;
import com.automation.propertyReader.PropertyFileReader;
import com.aventstack.extentreports.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vikas.kumar1 on 17-04-2018.
 */
public class TakeScreenShot {

    public static String takeScreenShot(String testCaseName) {
        String pathOfScreenShot = null;
        File destination = null;
        String imageName = null;
        try {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            Date date = new Date();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            pathOfScreenShot = PropertyFileReader.getProperty("pathOfScreenShot")+testCaseName+format.format(date)+".png";
            destination = new File(pathOfScreenShot);
            FileUtils.copyFile(source,destination );
            imageName = testCaseName+format.format(date)+".png";
                 }
        catch ( Exception e ){
        }
        return imageName;
    }
}
