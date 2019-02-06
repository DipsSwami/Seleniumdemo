package com.selenium.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
            List<WebElement> hotelList = MainList.findElements(By.tagName("li"));
            //List<WebElement> hotelList = driver.findElements(By.xpath("//ol[@class='listings infinite-scroll-enabled']//li"));
            List<SearchHotelList> iList = new ArrayList<>();
            SearchHotelList hotel = new SearchHotelList();

            System.out.println(hotelList.size());

            for (int i = 1; i <= hotelList.size(); i++)
            {
                String hotelPrice = driver.findElement(By.xpath("//li [" + i + "] //span[@class='old-price-cont']//ins")).getText();
                String hotelName = driver.findElement(By.xpath("//li [" + i + "] //h3[@class='p-name']//a")).getText();
                System.out.println(hotelPrice);
                System.out.println(hotelName);
                hotel.setHName(hotelName);
                hotel.setPrice(hotelPrice);
                iList.add(hotel);
                iList.forEach(a -> {
                    System.out.println("HotelName: " + a.getHName() + ", Price : " + a.getPrice());
                });

            }


//            for (WebElement listOfHotels : hotelList)
//            {


                    //hotelPrice.getText();


                /*String hotelPrice = driver.findElement(By.xpath("//li//span[@class='old-price-cont']//ins")).getText();
                //hotelPrice.getText();
                System.out.println(hotelPrice);
                String hotelName = listOfHotels.findElement(By.xpath("//li//h3[@class='p-name']//a")).getText();
                hotel.setHName(hotelName);
                hotel.setPrice(hotelPrice);
                iList.add(hotel);*/

          //  }




//                for (WebElement h: HName) {
//                    System.out.println("Hotel Price ----->" + h.getText());
//                    hotel.setHName(h.getText());
//                    iList.add(hotel);
//                }
//
//                    for (WebElement p: price)
//                    {
//                        System.out.println("Hotel Price ----->" + p.getText());
//
//                        //iList.add(new SearchHotelList(h.getText(),p.getText()));
//                    }




        }
        catch (Exception ex){

        }
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
