import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleGoogleTest {

    WebDriver drv;

    @Before
    public void googleTest_setup(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions opt = new ChromeOptions();
        //opt.setHeadless(true);
        opt.addArguments("start-fullscreen");
        drv = new ChromeDriver(opt);
    }

    @After
    public void googleTest_cleanup(){

        drv.quit();
    }

    @Test
    public void googleTest(){
        drv.get("https://google.com");

        System.out.println(((HasCapabilities) drv).getCapabilities());
    }
}