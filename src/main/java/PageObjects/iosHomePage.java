package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iosHomePage {

    public iosHomePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IntegerA']")
    public MobileElement IntegerA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IntegerB']")
    public MobileElement IntegerB;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Compute Sum']")
    public MobileElement CalculateSum;
}
