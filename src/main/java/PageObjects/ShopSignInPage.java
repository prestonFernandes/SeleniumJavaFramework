package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopSignInPage extends BasePage{
	public WebDriver driver;
	
	By passwordInputField=By.cssSelector("input#field-password");
	
	By emailInputField=By.cssSelector("input#field-email");
	
	By signInButton=By.cssSelector("button#submit-login");
	
	
	public ShopSignInPage() throws IOException {
		super();
	}
	
	public WebElement getEmailInputField() {
		this.driver=getDriver();
		return driver.findElement(emailInputField);
	}
	
	public WebElement getPasswordInputField() {
		this.driver=getDriver();
		return driver.findElement(passwordInputField);
	}
	
	public WebElement getSignInButton() {
		this.driver=getDriver();
		return driver.findElement(signInButton);
	}
	
}
