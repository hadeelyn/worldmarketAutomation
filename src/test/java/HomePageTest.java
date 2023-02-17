import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/");


    }

    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfullyAndRemoveAdds() {
        WebElement img = driver.findElement(By.xpath("//*[@id='slider-container']/div/div/div/div/a/div/div/img[1]"));
         assertTrue(img.isDisplayed());
        WebElement closei = driver.findElement(By.xpath(" //*[@id='cpwm-additionaldisclaimer3']/button"));
        closei.click();
    }

    @Test (priority = 2)
    public void verifyThatSelectStoreButtonIsDisplayed() {
        WebElement StoreButton = driver.findElement(By.xpath("//*[@id='selectStoreDialogLink']"));
        assertTrue(StoreButton.isDisplayed());
    }

    @Test(priority = 3)
    public void verifyThatSearch() {
        WebElement search = driver.findElement(By.id("navsearchbox"));
       search.sendKeys("Dekota");
        WebElement clicksearch = driver.findElement(By.xpath(" //*[@id='navsearchbox']"));
        clicksearch.click();

    }
    @Test(priority = 4)
    public void verifyThatfooterIsDisplayedSuccessfully() {
        WebElement img = driver.findElement(By.xpath("//*[@id='mainForm']/div[5]/div[1]/div[2]"));
        assertTrue(img.isDisplayed());

    }

    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}
