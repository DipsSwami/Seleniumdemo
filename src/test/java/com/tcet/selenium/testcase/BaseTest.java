package com.tcet.selenium.testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @AfterSuite
    public void cleanUP(){
        if(driver != null){
            driver.quit();
        }
    }

    protected WebDriver driver() {
        return driver;
    }

}
