package android;

import PageObjects.androidHomePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class androidTest extends androidConfig {

    @Test
    public static void TestApp() throws IOException {
        // Android Tests
       ExtentTest test = extent.createTest("Android Test", "Turn WiFi On in API Demo app");
       androidHomePage homePage= new androidHomePage(driver);
       homePage.Preference.click();
       homePage.Dependency.click();
       homePage.checkboxWiFi.click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("test-artifacts/Screenshot.jpg"));
        MediaEntityModelProvider screenshot = MediaEntityBuilder.createScreenCaptureFromPath("/test-artifacts/Screenshot.jpg").build();
        test.log(Status.PASS, "iOS Test Execution Passed");
        test.log(Status.INFO,"Test Success Screenshot",screenshot);

    }

}
