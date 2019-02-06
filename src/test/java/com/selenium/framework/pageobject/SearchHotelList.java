package com.selenium.framework.pageobject;

class SearchHotelList {

    private String _hotelName;
    private String _price;

    public  SearchHotelList(){}
    public SearchHotelList(String hotelName, String price) {
        this._hotelName = hotelName;
        this._price = price;
    }

    public String getHName(){
        return _hotelName;
    }

    public void setHName(String hotelName) {
        this._hotelName = hotelName;
    }

    public String getPrice(){
        return _price;
    }

    public void setPrice(String price) {
        this._price = price;
    }
}
