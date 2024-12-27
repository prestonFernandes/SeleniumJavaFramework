package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	private String url;
	private Properties props;
	public WebDriverWait wait;
	
	public BasePage() throws IOException {
		props=new Properties();
		FileInputStream data=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
		props.load(data);
	}
	
	public WebDriver getDriver() {
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
	
	public String getUrl() {
		return props.getProperty("url");
	}
	
	public void takeScreenshot(WebDriver driver) throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"\\target\\Screenshots\\"+getTimeStamp()+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public String getTimeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
	}

}
