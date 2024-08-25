package listenertestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	    // not implemented
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Tester Name","Smk");
	  }
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		test = extent.createTest(result.getName());	
		test.log(Status.PASS, "Passed: "+result.getName());
		  }
	
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 test = extent.createTest(result.getName());	
			test.log(Status.FAIL, "Failed TC: "+result.getName());
			test.log(Status.FAIL, "Failed Reason: "+result.getThrowable());
		  }
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		 test = extent.createTest(result.getName());	
			test.log(Status.SKIP, "Skipped TC: "+result.getName());
		  }
	 
	 public void onFinish(ITestContext context) {
		    // not implemented
		 extent.flush();
		  }
	 
}
