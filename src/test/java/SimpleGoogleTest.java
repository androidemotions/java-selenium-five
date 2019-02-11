import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleGoogleTest {

    WebDriver drv;

    @Before
    public void googleTest_setup(){
        WebDriverManager.chromedriver().setup();
        drv = new ChromeDriver();
    }

    @After
    public void googleTest_cleanup(){

        drv.quit();
    }

    @Test
    public void googleTest(){
        drv.get("https://google.com");
        drv.findElement(By.name("q")).sendKeys("Selenium");
        drv.findElement(By.name("btnK")).click();

    }

}
