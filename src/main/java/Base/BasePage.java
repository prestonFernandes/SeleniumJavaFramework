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

	private String url;
	private Properties props;
	public WebDriverWait wait;
	
	public BasePage() throws IOException {
		props=new Properties();
		FileInputStream data=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
		props.load(data);
	}
	
	public WebDriver getDriver() {		
		return WebDriverInstance.getDriver();
	}
	
	public String getUrl() {
		return props.getProperty("url");
	}
	
	public void takeScreenshot(String name) throws IOException {
		File srcFile=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"\\target\\Screenshots\\"+getTimeStamp()+".png");
		System.out.println(System.getProperty("user.dir")+"\\target\\Screenshots\\"+name+getTimeStamp()+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public String getTimeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
	}

}
