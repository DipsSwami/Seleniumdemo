package com.selenium.framework.testcase;

import com.selenium.framework.drivermanagement.DriverManager;
import com.selenium.framework.pageobject.HotelList;
import com.selenium.framework.pageobject.SearchHotel;
import com.sun.rowset.internal.WebRowSetXmlWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelBooking {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getDriverInstance();
        driver.get("https://ca.hotels.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void SearchHotel() {
        SearchHotel searchHotel = new SearchHotel(driver);
        //By.xpath("//td[contains(@data-date,'2019-1-19')]//a[contains(text(),'19')]")
        searchHotel.enterCity("New")
                .enterCheckIn("2019-1-19")
                .enterCheckOut("2019-2-15")
                .enterRoom(2)
                .searchHotel();
    }

    @Test(enabled = true)
    public void SelectHotel(){
        HotelList hotelList = new HotelList(driver)
                .selectFeaturedTab()
                .getHotelTitle()
                /*.selectHotelName()
                .bookNow()*/;
    }





}
