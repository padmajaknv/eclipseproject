package TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;


public class reporting {

//    public ExtentHtmlReporter reporter;
    public ExtentSparkReporter reporter;
    public static ExtentReports reports = new ExtentReports();
    public static ExtentTest tests;

    @BeforeTest
    public void generateReport(ITestContext context){
        reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\AutomationReport"+context.getName()+".html");
        reports.attachReporter(reporter);
        reporter.config().setDocumentTitle("Sample Report");
        reporter.config().setReportName("Sample Report");
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    @AfterSuite
    public void b(){
        reports.flush();
    }
    @AfterMethod
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            tests.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            tests.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            tests.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            tests.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            tests.skip(result.getThrowable());
        }
    }

}
