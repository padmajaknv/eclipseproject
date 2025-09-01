package TestNG;

import org.testng.IInvokedMethodListener;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test Started: "+result.getName());
    }
    
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Success: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test Failed: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test Ignored/Skipped: "+result.getName());
    }
}
