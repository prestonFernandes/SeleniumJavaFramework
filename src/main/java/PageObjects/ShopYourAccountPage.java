package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopYourAccountPage extends BasePage{
	public WebDriver driver;
	
	By pageHeading=By.cssSelector("header h1");
	By signOutButton=By.cssSelector("a.logout");
	By homeLink=By.xpath("//a//span[.='Home']");
	
	
	
	
	public ShopYourAccountPage() throws IOException {
		super();
	}
	
	public WebElement getPageHeading() {
		this.driver=getDriver();
		return driver.findElement(pageHeading);
	}
	
	public WebElement getSignOutButton() {
		this.driver=getDriver();
		return driver.findElement(signOutButton);
	}
	
	public WebElement getHomeLink() {
		this.driver=getDriver();
		return driver.findElement(homeLink);
	}
	
}
