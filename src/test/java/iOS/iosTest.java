package iOS;

import PageObjects.iosHomePage;
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


public class iosTest extends iosConfig {

    @Test
    public static void TestApp() throws IOException {
        // iOS Test
        ExtentTest test = extent.createTest("iOS Test", "Enter two integer and compute sum");
        iosHomePage homePage = new iosHomePage(driver);
        homePage.IntegerA.sendKeys("3");
        homePage.IntegerB.sendKeys("5");
        homePage.CalculateSum.click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("test-artifacts/Screenshot.jpg"));
        MediaEntityModelProvider screenshot = MediaEntityBuilder.createScreenCaptureFromPath("/test-artifacts/Screenshot.jpg").build();
        test.log(Status.PASS, "iOS Test Execution Passed");
        test.log(Status.INFO,"Test Success Screenshot",screenshot);

    }

    }

