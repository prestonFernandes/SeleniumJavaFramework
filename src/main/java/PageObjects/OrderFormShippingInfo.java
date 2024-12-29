package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormShippingInfo extends BasePage{
	public WebDriver driver;
	
	By commentFiled=By.cssSelector("textarea#delivery_message");
	By continueButton=By.xpath("//button[@name='confirmDeliveryOption']");
	
	public OrderFormShippingInfo() throws IOException {
		super();
	}
	
	public WebElement getCommentField() {
		this.driver=getDriver();
		return driver.findElement(commentFiled);
	}
	
	public WebElement getContinueButton() {
		this.driver=getDriver();
		return driver.findElement(continueButton);
	}
}
