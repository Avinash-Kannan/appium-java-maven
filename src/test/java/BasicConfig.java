import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class BasicConfig {

    static IOSDriver<IOSElement> driver;

    @BeforeTest
    public void setUpCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();

        // Android capabilities
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
//       // caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"TestEmulator");
//        capabilities.setCapability(MobileCapabilityType.APP,"/Users/avinashkannan/Documents/gatling-workspace/appium-java-demo/src/test/app/ApiDemos.apk");

//        // iOS capabilities
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
        // MobileCapabilityType.APP is set to the IOS app bundle file path that was created in Step 1. Replace it with your app bundle file path.
        capabilities
                .setCapability(MobileCapabilityType.APP,
                        "/Users/avinashkannan/Documents/gatling-workspace/appium-java-demo/src/test/app/TestApp.app");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

 driver = new IOSDriver<IOSElement>(url, capabilities);
        //driver = new AndroidDriver<AndroidElement>(url, capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }


    @AfterTest
    public void tearDownApp(){
        driver.closeApp();
    }


}
