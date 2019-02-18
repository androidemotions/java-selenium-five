package parallel;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SlowTests1 extends TestBase{

//    static WebDriver driver;
//
//    @BeforeClass
//    public static void setup()
//    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @AfterClass
//    public static void  cleanup()
//    {
//        driver.quit();
//    }

    @Test
    public void one() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

    @Test
    public void two() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

    @Test
    public void three() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

    @Test
    public void four() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

    @Test
    public void five() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

    @Test
    public void six() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    }

}
