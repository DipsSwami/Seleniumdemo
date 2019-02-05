package com.selenium.framework.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class DriverConfig {

    private static Properties properties;

    private DriverConfig() {
        try
        {
            properties = new Properties();
            Path path = Paths.get("src","test","resources","driverconfig.properties");
            InputStream fileInputStream = new FileInputStream(path.toFile());
            properties.load(fileInputStream);
        }
        catch(IOException io) {}
    }

    public static String getProperty(String key){
        if(properties == null) {
            new DriverConfig();
        }
        return properties.get(key).toString();
    }
}
