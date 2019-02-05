package com.selenium.framework.drivermanagement;

import com.selenium.framework.config.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static DriverManager driverManager;
    private WebDriver driver;

    private DriverManager(){
        if(DriverConfig.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver",DriverConfig.getProperty("chrome-driver-path"));
            this.driver = new ChromeDriver();
        }
        if(DriverConfig.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver",DriverConfig.getProperty("gecko-driver-path"));
            this.driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriverInstance() {
        if(driverManager == null){
            driverManager = new DriverManager();
        }
        return  driverManager.driver;
    }
}
