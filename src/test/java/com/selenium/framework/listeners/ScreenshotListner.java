package com.selenium.framework.listeners;

import com.selenium.framework.drivermanagement.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class ScreenshotListner implements ITestListener {

    WebDriver driver = DriverManager.getDriverInstance();
    String filePath = "C:\\Users\\DSwami\\IdeaProjects\\Screenshot";

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("********" + result.getName() + "********");
        String methodName = result.getName().trim();
        ITestContext context = result.getTestContext();
        driver = (WebDriver)context.getAttribute("driver");
        takeScreenshot(methodName,driver);

    }

    public void takeScreenshot(String methodName, WebDriver driver){
        File scFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scFile, new File(filePath+methodName+".png"));
            System.out.println("************* Placed Screenshot in " + filePath + " ");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
