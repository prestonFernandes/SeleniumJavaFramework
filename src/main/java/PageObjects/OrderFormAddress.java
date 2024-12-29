package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormAddress extends BasePage{
	public WebDriver driver;
	
	By addressField=By.cssSelector("input#field-address1");
	By cityField=By.cssSelector("input#field-city");
	By stateSelectionField=By.cssSelector("select#field-id_state");
	By postalCodeField=By.cssSelector("input#field-postcode");
	By countrySelectionField=By.cssSelector("select#field-id_country");
	By phoneNumber=By.cssSelector("input#field-phone");//optional field
	By useSameAddressCheckbox=By.cssSelector("input#use_same_address");
	By continueButton=By.xpath("//button[@name='confirm-addresses']");
	
	public OrderFormAddress() throws IOException {
		super();
	}
	
	public WebElement getAddressField() {
		this.driver=getDriver();
		return driver.findElement(addressField);
	}
	
	public WebElement getCityField() {
		this.driver=getDriver();
		return driver.findElement(cityField);
	}
	
	public WebElement getStateSelectionField() {
		this.driver=getDriver();
		return driver.findElement(stateSelectionField);
	}
	
	public WebElement getPostalCodeField() {
		this.driver=getDriver();
		return driver.findElement(postalCodeField);
	}
	
	public WebElement getCountrySelectionField() {
		this.driver=getDriver();
		return driver.findElement(countrySelectionField);
	}
	
	public WebElement getPhoneNumberField() {
		this.driver=getDriver();
		return driver.findElement(phoneNumber);
	}
	
	public WebElement getUseSameAddressCheckbox() {
		this.driver=getDriver();
		return driver.findElement(useSameAddressCheckbox);
	}
	
	public WebElement getContinueButton() {
		this.driver=getDriver();
		return driver.findElement(continueButton);
	}
}
