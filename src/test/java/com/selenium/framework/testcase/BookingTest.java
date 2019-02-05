package com.selenium.framework.testcase;

import com.selenium.framework.drivermanagement.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BookingTest {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getDriverInstance();
        driver.get("https://www.booking.com/");
    }

    @Test(enabled = false)
    public void checkTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Booking"));
    }

    @Test
    public void searchDesination(){
      WebElement destinationtext = driver.findElement(By.name("ss"));
      destinationtext.sendKeys("T");
      //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //IMPLICIT WAIT

      WebDriverWait wait = new WebDriverWait(driver, 10); // EXPLICIT WAIT
      WebElement findCity = driver.findElement(By.xpath("//b[contains(text(),'Toronto')]"));
      findCity.click();
      WebElement checkInDate = driver.findElement( By.xpath("//div[@class='xp__input-group xp__date-time']"));
      checkInDate.click();

     // WebDriverWait wait = wait.until(ExpectedConditions.presenceOfElementLocated(""));
      driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void tableDemo() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.skyscanner.ca/hotels");
        WebElement destination=driver.findElement(By.id("destination-autosuggest"));
        destination.sendKeys("seattle");

        WebElement checkIn=driver.findElement(By.id("checkin"));
        checkIn.click();
        driver.findElement(By.xpath("//div[@class='bpk-calendar-grid-transition__strip-18XLq']//table[2]//tr[1]//td[6]"));

    }

    @AfterSuite
    public void cleanUp() {
        if(driver != null) {
            driver.quit();
        }
    }
}
