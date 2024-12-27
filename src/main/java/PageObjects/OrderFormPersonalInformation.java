package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersonalInformation {
	public WebDriver driver;
	
	By mrRadioButton=By.cssSelector("input#field-id_gender-1");
	By mrsRadioButton=By.cssSelector("input#field-id_gender-2");
	By firstNameInputField=By.cssSelector("input#field-firstname");
	By lastNameInputField=By.cssSelector("input#field-lastname");
	By emailInputField=By.cssSelector("input#field-email");
	By passwordInputField=By.cssSelector("input#field-password");
	By birthDateInputField=By.cssSelector("input#field-birthday");
	By receiveOffersFromPartnersCheckbox=By.xpath("//input[@name='optin']");
	By termsAndConditionsCheckbox=By.xpath("//input[@name='psgdpr']");
	By newsLetterCheckbox=By.xpath("//input[@name='newsletter']");
	By continueButton=By.xpath("//button[@name='continue']");
	
	public OrderFormPersonalInformation(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getMrRadioButton() {
		return driver.findElement(mrRadioButton);
	}
	
	public WebElement getMrsRadioButton() {
		return driver.findElement(mrsRadioButton);
	}
	
	public WebElement getFirstNameInputField() {
		return driver.findElement(firstNameInputField);
	}
	
	public WebElement getLastNameInputField() {
		return driver.findElement(lastNameInputField);
	}
	
	public WebElement getEmailInputField() {
		return driver.findElement(emailInputField);
	}
	
	public WebElement getPasswordInputField() {
		return driver.findElement(passwordInputField);
	}
	
	public WebElement getBirthDateInputField() {
		return driver.findElement(birthDateInputField);
	}
	
	public WebElement getReceiveOffersCheckbox() {
		return driver.findElement(receiveOffersFromPartnersCheckbox);
	}
	
	public WebElement getTermsAndConditionsCheckbox() {
		return driver.findElement(termsAndConditionsCheckbox);
	}
	
	public WebElement getNewsletterCheckbox() {
		return driver.findElement(newsLetterCheckbox);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
	}
	
}
