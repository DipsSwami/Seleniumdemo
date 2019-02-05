package com.selenium.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHotel {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "qf-0q-destination")
    WebElement city;
    @FindBy(id = "qf-0q-localised-check-in")
    WebElement checkInDate;
    @FindBy(id = "qf-0q-localised-check-out")
    WebElement checkOutDate;
    @FindBy(id = "qf-0q-compact-occupancy")
    WebElement rooms;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchHotel;

    public SearchHotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public SearchHotel enterCity(String city) {
        try {
            this.city.sendKeys(city);
            wait = new WebDriverWait(driver, 5000);
            WebElement getCityText = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement
                    (By.xpath("//tr[@id='citysqm-asi0-s0']//div[@class='autosuggest-category-result'][contains(text(),'York, New York, United States of America')]"))));
            //Thread.sleep(5000);
          //  WebElement getCityText = driver.findElement(By.xpath("//tr[@id='citysqm-asi0-s0']//div[@class='autosuggest-category-result'][contains(text(),'York, New York, United States of America')]"));
            getCityText.click();

        }
        catch (Exception ex) {
        }
        return this;
    }

    public SearchHotel enterCheckIn(String checkInDate) {
        this.checkInDate.sendKeys(checkInDate);
        return this;
    }

    public SearchHotel enterCheckOut(String checkOutDate) {
        this.checkOutDate.sendKeys(checkOutDate);
        return this;
    }

    public SearchHotel enterRoom(int Index) {
        Select select = new Select(this.rooms);
        select.selectByIndex(Index);
        return this;
    }

    public SearchHotel searchHotel() {
        this.searchHotel.click();
        return this;
    }
}
