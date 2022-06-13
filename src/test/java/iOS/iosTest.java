package iOS;

import PageObjects.iosHomePage;
import org.testng.annotations.Test;



public class iosTest extends iosConfig {

    @Test
    public static void TestApp() {

        // iOS Test
        iosHomePage homePage= new iosHomePage(driver);
        homePage.IntegerA.sendKeys("3");
        homePage.IntegerB.sendKeys("5");
        homePage.CalculateSum.click();

    }

}
