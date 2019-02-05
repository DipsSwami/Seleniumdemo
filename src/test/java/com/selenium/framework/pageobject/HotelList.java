package com.selenium.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.reporters.jq.Main;

import java.util.*;


public class HotelList {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Featured')]")
    WebElement featuredTab;
//    @FindBy(xpath = "//h1[contains(text(),'The Grand NYC')]")
//    WebElement hotelTitle;
    @FindBy(xpath = "//a[contains(text(),'The Grand NYC')]")
    WebElement hotelName;
    @FindBy(xpath = "//a[contains(@class,'cta cta-strong')]")
    WebElement bookNow;


    ////ol[@class='listings infinite-scroll-enabled']//li[1]//div[@class='hotel-wrap']//h3//a[1]

    public  List<SearchHotelList> iList = new ArrayList<SearchHotelList>();

    public HotelList(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public HotelList selectFeaturedTab(){
        this.featuredTab.click();
        return this;
    }

    public HotelList getHotelTitle(){
        try {
            WebElement MainList = driver.findElement(By.xpath("//ol[@class='listings infinite-scroll-enabled']"));
            List<WebElement> links = MainList.findElements(By.xpath("//span[@class='old-price-cont']//ins"));
            //System.out.println(links.size());
                for (WebElement r: links)
                {
                    System.out.println("Hotel Price ----->" + r.getText());
                }
            }
        catch (Exception ex){ }
        return this;
    }

    public HotelList selectHotelName(){
        this.hotelName.click();
        return this;
    }

    public HotelList bookNow(){
        this.bookNow.click();
        return this;
    }


}
