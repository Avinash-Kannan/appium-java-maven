package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class extentReports {
    public static ExtentReports extent;
    public static ExtentHtmlReporter htmlReporter;

    @BeforeSuite
    public void reporterSetUp(){

        htmlReporter = new ExtentHtmlReporter("test-artifacts/extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void reporterTearDown(){
        extent.flush();
    }
}

