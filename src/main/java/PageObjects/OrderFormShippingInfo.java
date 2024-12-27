package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormShippingInfo {
	public WebDriver driver;
	
	By commentFiled=By.cssSelector("textarea#delivery_message");
	By continueButton=By.xpath("//button[@name='confirmDeliveryOption']");
	
	public OrderFormShippingInfo(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getCommentField() {
		return driver.findElement(commentFiled);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
	}
}
