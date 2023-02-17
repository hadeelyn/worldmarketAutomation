import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WindowSize {
    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.worldmarket.com/");
        Dimension iphonexr= new Dimension(414,896);
        Dimension ipadAir= new Dimension(820,1180);
        driver.manage().window().setSize(iphonexr);

    }
}
