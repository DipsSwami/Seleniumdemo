package com.tcet.selenium.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class SampleTest extends BaseTest {

    @Test
    public void testcase1() {
        driver().get("https://google.com");
        WebElement text = driver().findElement(By.name("q"));
        text.sendKeys("Selenium Testing");
        text.sendKeys(Keys.ENTER);

//        driver().findElement(By.name("q")).submit();
//        String pageUrl = driver().getCurrentUrl();
//        Assert.assertTrue(pageUrl.contains("https://google.com/search"),
//               "Page url:" + driver().getCurrentUrl() + "was not starting with https://www.google.com" );




    }


}
