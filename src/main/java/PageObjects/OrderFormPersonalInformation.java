package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormPersonalInformation extends BasePage{
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
	
	public OrderFormPersonalInformation() throws IOException {
		super();
	}
	
	public WebElement getMrRadioButton() {
		this.driver=getDriver();
		return driver.findElement(mrRadioButton);
	}
	
	public WebElement getMrsRadioButton() {
		this.driver=getDriver();
		return driver.findElement(mrsRadioButton);
	}
	
	public WebElement getFirstNameInputField() {
		this.driver=getDriver();
		return driver.findElement(firstNameInputField);
	}
	
	public WebElement getLastNameInputField() {
		this.driver=getDriver();
		return driver.findElement(lastNameInputField);
	}
	
	public WebElement getEmailInputField() {
		this.driver=getDriver();
		return driver.findElement(emailInputField);
	}
	
	public WebElement getPasswordInputField() {
		this.driver=getDriver();
		return driver.findElement(passwordInputField);
	}
	
	public WebElement getBirthDateInputField() {
		this.driver=getDriver();
		return driver.findElement(birthDateInputField);
	}
	
	public WebElement getReceiveOffersCheckbox() {
		this.driver=getDriver();
		return driver.findElement(receiveOffersFromPartnersCheckbox);
	}
	
	public WebElement getTermsAndConditionsCheckbox() {
		this.driver=getDriver();
		return driver.findElement(termsAndConditionsCheckbox);
	}
	
	public WebElement getNewsletterCheckbox() {
		this.driver=getDriver();
		return driver.findElement(newsLetterCheckbox);
	}
	
	public WebElement getContinueButton() {
		this.driver=getDriver();
		return driver.findElement(continueButton);
	}
	
}
