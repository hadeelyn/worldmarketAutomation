import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FilterProductTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/category/kitchen/new.do?ab=home:51:d:2:fresh-kitchen");

    }
    @Test
    public void filter() {
        WebElement closei = driver.findElement(By.xpath(" //*[@id='cpwm-additionaldisclaimer3']/button"));
        closei.click();

         {
            WebElement dropdown = driver.findElement(By.cssSelector(".hidden-xs > #ml-sortby-dropdown"));
            dropdown.findElement(By.xpath("//option[. = 'Price: Low To High']")).isDisplayed();
        }

        driver.findElement(By.cssSelector(".filterGroup_material .glyphicon")).isDisplayed();
        driver.findElement(By.cssSelector("#material_0 > .ml-label")).isDisplayed();
        driver.findElement(By.cssSelector(".filterGroup_productType .glyphicon")).isDisplayed();
        driver.findElement(By.cssSelector("#productType_1 > .ml-label")).isDisplayed();
        driver.findElement(By.cssSelector("#productType_0 > .ml-label")).isDisplayed();
    }
    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }

}
