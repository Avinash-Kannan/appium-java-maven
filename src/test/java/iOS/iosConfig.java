package iOS;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class iosConfig {

    static IOSDriver<MobileElement> driver;

    @BeforeTest
    public void setUpCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();

        // iOS capabilities
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
        capabilities
                .setCapability(MobileCapabilityType.APP,
                        "/Users/avinashkannan/Documents/gatling-workspace/appium-java-demo/src/main/app/TestApp.app");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new IOSDriver<MobileElement>(url, capabilities);

    }


    @AfterTest
    public void tearDownApp(){
        driver.closeApp();
    }


}
