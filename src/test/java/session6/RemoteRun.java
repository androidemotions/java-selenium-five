package session6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteRun {

    RemoteWebDriver drv;

    @Before
    public void start() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "firefox");
        //cap.setCapability("platform", "LINUX");

        drv = new RemoteWebDriver(new URL("http://192.168.56.102:3344/wd/hub"),
                cap);

    }

    @Test
    public void remoteTest() {
        drv.get("http://google.com");
        drv.findElementByName("q").sendKeys("Remote WebDriver" + Keys.ENTER);
    }

    @After
    public void stop() {
        drv.quit();
    }

}
