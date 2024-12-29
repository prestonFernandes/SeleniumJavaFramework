package Base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BasePage{

	public Hooks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup() {
		getDriver().get(getUrl());;
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
		WebDriverInstance.driverCleanup();
//		driver=null;
	}

}
