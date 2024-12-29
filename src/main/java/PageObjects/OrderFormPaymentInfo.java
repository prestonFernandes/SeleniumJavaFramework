package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormPaymentInfo extends BasePage{
	public WebDriver driver;
	
	By payByBankWireRadioButton=By.cssSelector("input#payment-option-1");
	By payByChequeRadioButton=By.cssSelector("input#payment-option-2");
	By termsOfServiceCheckbox=By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By placeOrderButton=By.xpath("//button[contains(.,'order')]");
	
	public OrderFormPaymentInfo( ) throws IOException {
		super();
	}
	
	public WebElement getPayByBankWireRadioButton() {
		this.driver=getDriver();
		return driver.findElement(payByBankWireRadioButton);
	}
	
	public WebElement getPayByChequeRadioButton() {
		this.driver=getDriver();
		return driver.findElement(payByChequeRadioButton);
	}
	
	public WebElement getTermsOfServiceCheckbox() {
		this.driver=getDriver();
		return driver.findElement(termsOfServiceCheckbox);
	}
	
	public WebElement getPlaceOrderButton() {
		this.driver=getDriver();
		return driver.findElement(placeOrderButton);
	}
}
