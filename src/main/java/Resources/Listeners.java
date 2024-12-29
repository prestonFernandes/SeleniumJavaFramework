package Resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.BasePage;

public class Listeners extends BasePage implements ITestListener{

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed TC");
	    try {
	    	takeScreenshot(result.getName());
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}


}
