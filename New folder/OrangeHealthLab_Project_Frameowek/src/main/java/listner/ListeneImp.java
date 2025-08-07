package  listner;

import java.io.ObjectInputFilter.Status;
/**
 * 
 * @author SANU
 * 
 * test class for Listner to monitor runtime events
 * Configure HTML Rports
 * generate HTML Reports
 * takes screenshot for failed test cases
 *
 */
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import utility.BaseClass;


public class ListeneImp implements ITestListener, ISuiteListener {
	public ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	public void onStart(ISuite suite) {
		System.out.println("report coniguration");

		// spark report config
		String time = new Date().toString().replace(" ", "_").replace(":", "_");

		spark = new ExtentSparkReporter("./AdvanceReoprt/report_" + time + ".html");
		spark.config().setDocumentTitle("CRM Test suite result");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
		spark.viewConfigurer().viewOrder().as(new ViewName[] { ViewName.DASHBOARD, ViewName.EXCEPTION,
				ViewName.CATEGORY, ViewName.DEVICE, ViewName.TEST }).apply();

		// add environment information and create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", System.getProperty("os.name"));
		report.setSystemInfo("Java version", System.getProperty("java.vrsion"));
		report.setSystemInfo("App URL", "http://49.249.28.218:8888/");
		report.setSystemInfo("Browser", "Chrome11");

	}

	public void onFinish(ISuite suite) {
		System.out.println("report backup");

		report.flush();

	}

	public void onTestStart(ITestResult result) {
		System.out.println("=========" + result.getMethod().getMethodName() + "======START======");

		test = report.createTest(result.getMethod().getMethodName());// to ceate test case inside extent report

		UtilityClassObject.setTest(test);

		test.log(com.aventstack.extentreports.Status.INFO, result.getMethod().getMethodName() + "=====STARTED=======");

		test.assignAuthor("SANU");

		test.assignCategory("ContactTest");
		test.assignDevice("HP Pavilion ");

	}

	public void onTestSuccess(ITestResult result) {

		String test_name = result.getMethod().getMethodName();
		System.out.println("=========" + test_name + "======END======");
		test.log(com.aventstack.extentreports.Status.INFO, test_name)
				.info(MarkupHelper.createLabel(test_name + "<b> ===> is PASSED</b>", ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		TakesScreenshot sc = (TakesScreenshot) BaseClass.sdriver;
		String filepath = sc.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");

		test.addScreenCaptureFromBase64String(filepath, testName + "_" + time);

		test.log(com.aventstack.extentreports.Status.INFO, testName)
				.info(MarkupHelper.createLabel(testName + "<b> ====> is FAILED</b>", ExtentColor.RED));

		test.log(com.aventstack.extentreports.Status.INFO, result.getThrowable());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
