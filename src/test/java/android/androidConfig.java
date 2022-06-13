package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class androidConfig {

    static AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUpCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();

        // Android capabilities
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        // caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"TestEmulator");
        capabilities.setCapability(MobileCapabilityType.APP,
                "/Users/avinashkannan/Documents/gatling-workspace/appium-java-demo/src/main/app/ApiDemos.apk");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<AndroidElement>(url, capabilities);
    }


    @AfterTest
    public void tearDownApp(){
        driver.closeApp();
    }


}
