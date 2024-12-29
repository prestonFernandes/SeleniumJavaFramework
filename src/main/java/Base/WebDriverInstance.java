package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance {
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driver.get()==null) {
			try {
				driver.set(createDriver());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver=null;
		
		Properties props=new Properties();
		FileInputStream data=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
		props.load(data);
		
		if(props.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(props.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void driverCleanup() {
		driver.get().quit();
		driver.remove();
	}
}
