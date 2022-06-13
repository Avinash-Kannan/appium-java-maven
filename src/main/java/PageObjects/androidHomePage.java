package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class androidHomePage {

    public androidHomePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement Preference;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public MobileElement Dependency;

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkboxWiFi;
}
