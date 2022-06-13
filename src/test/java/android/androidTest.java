package android;

import PageObjects.androidHomePage;
import org.testng.annotations.Test;


public class androidTest extends androidConfig {

    @Test
    public static void TestApp() {
        // Android Tests
       androidHomePage homePage= new androidHomePage(driver);
       homePage.Preference.click();
       homePage.Dependency.click();
       homePage.checkboxWiFi.click();

    }

}
