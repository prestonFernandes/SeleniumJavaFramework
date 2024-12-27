package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	By toggleButton=By.cssSelector(".toggle");
	By homePage=By.linkText("HOMEPAGE");
	By accordion=By.linkText("ACCORDION");
	By actions=By.linkText("ACTIONS");
	By browserTabs=By.linkText("BROWSER TABS");
	By buttons=By.linkText("BUTTONS");
	By calculator=By.linkText("CALCULATOR (JS)");
	By contactUsForm=By.linkText("CONTACT US FORM TEST");
	By datePicker=By.linkText("DATA PICKER");
	By dropdownCheckboxRadio=By.linkText("DROPDOWN CHECKBOX RADIO");
	By fileUpload=By.linkText("FILE UPLOAD");
	By hiddenElements=By.linkText("HIDDENT ELEMENTS");
	By iFrames=By.linkText("IFRAMES");
	By loader=By.linkText("LOADER");
	By loader2=By.linkText("LOADER2");
	By loginPortal=By.linkText("LOGIN PORTAL TEST");
	By mouseMovement=By.linkText("MOUSE MOVEMENT");
	By popupsAndAlerts=By.linkText("POPUPS & ALERTS");
	By predtictiveSearch=By.linkText("PREDICTIVE SEARCH");
	By tables=By.linkText("TABLES");
	By testStore=By.linkText("TEST STORE");
	By aboutMe=By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");


	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getToggleButton() {
		return driver.findElement(toggleButton);
	}
	
	public WebElement getHomePage() {
		return driver.findElement(homePage);
	}
	
	public WebElement getAccordions() {
		return driver.findElement(accordion);
	}
	
	public WebElement getActions() {
		return driver.findElement(actions);
	}
	
	public WebElement getBrowserTabs() {
		return driver.findElement(browserTabs);
	}
	
	public WebElement getButtons() {
		return driver.findElement(buttons);
	}
	
	public WebElement getCalculator() {
		return driver.findElement(calculator);
	}
	
	public WebElement getContactUsForm() {
		return driver.findElement(contactUsForm);
	}
	
	public WebElement getDatePicker() {
		return driver.findElement(datePicker);
	}
	
	public WebElement getDropdownCheckboxRadio() {
		return driver.findElement(dropdownCheckboxRadio);
	}
	
	public WebElement getFileUpload() {
		return driver.findElement(fileUpload);
	}
	
	public WebElement getHiddenElements() {
		return driver.findElement(hiddenElements);
	}
	
	public WebElement getIFrames() {
		return driver.findElement(iFrames);
	}
	
	public WebElement getLoader() {
		return driver.findElement(loader);
	}
	
	public WebElement getLoader2() {
		return driver.findElement(loader2);
	}
	
	public WebElement getLoginPortal() {
		return driver.findElement(loginPortal);
	}
	
	public WebElement getMouseMovement() {
		return driver.findElement(mouseMovement);
	}
	
	public WebElement getPopupsAndAlerts() {
		return driver.findElement(popupsAndAlerts);
	}
	
	public WebElement getPredtictiveSearch() {
		return driver.findElement(predtictiveSearch);
	}
	
	public WebElement getTables() {
		return driver.findElement(tables);
	}
	
	public WebElement getTestStore() {
		return driver.findElement(testStore);
	}
	
	public WebElement getAboutMe() {
		return driver.findElement(aboutMe);
	}
	
	public WebElement getCookie() {
		return driver.findElement(cookie);
	}
}
