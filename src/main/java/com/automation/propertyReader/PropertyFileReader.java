package com.automation.propertyReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
/**
 * Created by vikas.kumar1 on 22-12-2017.
 */
public class PropertyFileReader   {
    private static Properties reader;
    private static FileOutputStream ofs;
    private static final String path = "src\\main\\resources\\file\\config.properties";

    public static void initConfigFileRead() throws Exception{
        if(reader == null){
            File filePath = new File(path);
            FileInputStream fis = new FileInputStream(filePath);

            reader = new Properties();
            reader.load(fis);
        }
    }

    public static String getProperty(String key)throws Exception{
          initConfigFileRead();
          return reader.getProperty(key);
    }


    public static String getPropertyFromConfig(String key) throws Exception{
        initConfigFileRead();
        return reader.getProperty(key);


    }


}
