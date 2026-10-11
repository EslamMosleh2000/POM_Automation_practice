package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;

    @BeforeTest
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost/");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }


    @AfterTest
    public void stopDriver() {
        driver.quit();
    }
}
