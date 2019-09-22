import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class MyFirstTest {
    // private String BUNDLE_ID = "com.apple.mobileslideshow";
    private IOSDriver driver;
    private WebDriverWait wait;

    private By search = MobileBy.custom("search");
    private By cancel = MobileBy.AccessibilityId("Cancel");
    private By cart = MobileBy.custom("cart");

    @Before
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "12.4");
        caps.setCapability("deviceName", "iPhone XR");
        // caps.setCapability("bundleId", BUNDLE_ID);
        caps.setCapability("browserName", "Safari");

        // Map<String, String> customFindModules = new HashMap<>();
        // customFindModules.put("ai", "test-ai-classifier");

        // caps.setCapability("customFindModules", customFindModules);
        // caps.setCapability("shouldUseCompactResponses", false);
        // caps.setCapability("clearSystemFiles", true);
        // caps.setCapability("uiautomator2ServerLaunchTimeout", "50000");

        driver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
        wait  = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {}
    }

    @Test
    public void myTest() {
        driver.get("https://ranking.rakuten.co.jp");
        // driver.findElement(By.)
    }    
}