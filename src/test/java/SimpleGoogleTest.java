import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleGoogleTest {

    WebDriver drv;

    @Before
    public void googleTest_setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("w3c", true);

        drv = new ChromeDriver(opt);
    }

    @After
    public void googleTest_cleanup() {

        drv.quit();
    }

    @Test
    public void googleTest() {
        drv.get("https://google.com");
        drv.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        ;
        System.out.println(((HasCapabilities) drv).getCapabilities());
    }
}