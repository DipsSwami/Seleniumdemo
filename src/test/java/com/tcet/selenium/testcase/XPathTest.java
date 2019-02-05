package com.tcet.selenium.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class XPathTest {

 //   WebDriver driver;
//    @BeforeSuite
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void testcase1() {
//        try
//        {
//            driver.get("http://automationpractice.com");
//           // Thread.sleep(5000);
//            driver.manage().window().maximize();
//            driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dress");
//           // Thread.sleep(2000);
//            WebElement Value = driver.findElement(By.xpath("//button[@name='submit_search']"));
//            Value.click();
//            WebElement selectedItem = driver.findElement(By.xpath("//a/img[@title='Printed Chiffon Dress']"));
//            selectedItem.click();
//            String title = driver.getTitle();
//            System.out.println(title);
//            Thread.sleep(1000);
//            Assert.assertTrue(title.contains("Printed Chiffon Dress"));
//            Thread.sleep(1000);
//            WebElement Quantity =  driver.findElement(By.id("quantity_wanted"));
//            Quantity.sendKeys("2");
//            Thread.sleep(1000);
//            WebElement color = driver.findElement(By.id("color_15"));
//            color.isSelected();
//            Thread.sleep(1000);
//            WebElement addTocart = driver.findElement(By.xpath("//button//span[contains[text(),\"Add to cart\"]]"));
//            addTocart.click();
//            Thread.sleep(2000);
//        }
//        catch(Exception exec) {
//        }
//    }

//    @Test
//    public void testcase2() {
//        try
//        {
//            driver.get("http://automationpractice.com");
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dress");
//            driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//            Thread.sleep(2000);
//            //driver.findElement(By.xpath("//h5/a[@href=\"/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&adId=A03634161ZD6HUUPX0C13&url=%2FApple-iPhone-GSM-Unlocked-5-8%2Fdp%2FB075QN8NDJ%2Fref%3Dsr_1_1_sspa%3Fkeywords%3Diphone%2Bx%26qid%3D1548173971%26sr%3D8-1-spons%26psc%3D1&qualifier=1548173971&id=8195152283191056&widgetName=sp_atf\"]")).click();
//            WebElement Value = driver.findElement(By.xpath("//span[contains(text(), 'Apple iPhone X, GSM Unlocked 5.8\", 64 GB - Silver')]"));
//            Value.click();
//            driver.findElement(By.xpath("//span[contains(text(), 'Apple iPhone X, GSM Unlocked 5.8\", 64 GB - Silver')]"));
//
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//button//span[contains(text(), '256 GB')]")).isSelected();
//            // driver.findElement(By.xpath("//button[@id=\"a-autoid-7-announce\"]")).isSelected();
//            Thread.sleep(6000);
//            driver.findElement(By.id("add-to-cart-button-ubb")).click();
//            Thread.sleep(5000);
//        }
//        catch(Exception exec) {
//
//        }
 //   }

  //  @AfterSuite
  //  public void close(){
  //      driver.quit();
  //  }
}
