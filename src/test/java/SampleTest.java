import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;
import java.util.List;



public class SampleTest extends BasicConfig {

    @Test
    public static void TestApp() {
        // Android
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Preferences from XML']").click();
        List<MobileElement> elementList = driver.findElementsByClassName("android.widget.CheckBox");
		elementList.get(1).click();
		elementList.get(2).click();

        // iOS
//        driver.findElementByXPath("//XCUIElementTypeTextField[@name='IntegerA']").sendKeys("3");
//        driver.findElementByXPath("//XCUIElementTypeTextField[@name='IntegerB']").sendKeys("5");
//        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Compute Sum']").click();

    }

}
