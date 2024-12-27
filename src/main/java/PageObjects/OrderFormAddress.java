package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormAddress {
	public WebDriver driver;
	
	By addressField=By.cssSelector("input#field-address1");
	By cityField=By.cssSelector("input#field-city");
	By stateSelectionField=By.cssSelector("select#field-id_state");
	By postalCodeField=By.cssSelector("input#field-postcode");
	By countrySelectionField=By.cssSelector("select#field-id_country");
	By phoneNumber=By.cssSelector("input#field-phone");//optional field
	By useSameAddressCheckbox=By.cssSelector("input#use_same_address");
	By continueButton=By.xpath("//button[@name='confirm-addresses']");
	
	public OrderFormAddress(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getAddressField() {
		return driver.findElement(addressField);
	}
	
	public WebElement getCityField() {
		return driver.findElement(cityField);
	}
	
	public WebElement getStateSelectionField() {
		return driver.findElement(stateSelectionField);
	}
	
	public WebElement getPostalCodeField() {
		return driver.findElement(postalCodeField);
	}
	
	public WebElement getCountrySelectionField() {
		return driver.findElement(countrySelectionField);
	}
	
	public WebElement getPhoneNumberField() {
		return driver.findElement(phoneNumber);
	}
	
	public WebElement getUseSameAddressCheckbox() {
		return driver.findElement(useSameAddressCheckbox);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
	}
}
