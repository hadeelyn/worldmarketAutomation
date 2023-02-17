
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;



public class ProductDetailedPageTest {

         BaseTest baseTest = new BaseTest();
         ChromeDriver driver;

         @BeforeClass
         public void setUp() {
             driver = baseTest.setUp("https://www.worldmarket.com/product/square+white+ceramic+berry+basket.do?sortby=ourPicks&from=fn");

         }
         @Test
         public void VerifyProductPageWorkingPropaplay() {

             driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) > .btn")).click();
             driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) > .btn")).click();

             driver.findElement(By.id("addToBasket462254")).click();

          }
    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
     }



