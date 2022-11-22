package Test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentFactory extends ApparelAndShoesTest {
	public static void main(String[] args) throws IOException {
	ExtentReports extentReports=new ExtentReports();
	File file = new File("report.html");
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	extentReports.attachReporter(sparkReporter);
	
	ExtentTest test1=extentReports.createTest("Test 1");
	test1.pass("This is passed");
	
	ExtentTest test2=extentReports.createTest("Test 2");
	test2.log(Status.FAIL, "This is failed");
	
	extentReports.createTest("Test 3").skip("This is skipped");
	
	extentReports.flush();
	Desktop.getDesktop().browse(new File("report.html").toURI());
	}

}
