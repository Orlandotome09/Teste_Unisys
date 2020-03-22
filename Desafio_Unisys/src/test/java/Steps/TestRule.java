package Steps;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class TestRule {

private static WebDriver driver;

    @Before
    public void beforeCenario(){

        System.setProperty("webdriver.chrome.driver","src//test//resources//drivers//chromedriver.exe");
       // ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void afterCenario(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
