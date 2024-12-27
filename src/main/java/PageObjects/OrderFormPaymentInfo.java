package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPaymentInfo {
	public WebDriver driver;
	
	By payByBankWireRadioButton=By.cssSelector("input#payment-option-1");
	By payByChequeRadioButton=By.cssSelector("input#payment-option-2");
	By termsOfServiceCheckbox=By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By placeOrderButton=By.xpath("//button[contains(.,'order')]");
	
	public OrderFormPaymentInfo(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getPayByBankWireRadioButton() {
		return driver.findElement(payByBankWireRadioButton);
	}
	
	public WebElement getPayByChequeRadioButton() {
		return driver.findElement(payByChequeRadioButton);
	}
	
	public WebElement getTermsOfServiceCheckbox() {
		return driver.findElement(termsOfServiceCheckbox);
	}
	
	public WebElement getPlaceOrderButton() {
		return driver.findElement(placeOrderButton);
	}
}
