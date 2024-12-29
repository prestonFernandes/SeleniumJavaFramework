package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage{
	public WebDriver driver;
	
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


	
	public HomePage() throws IOException {
		super();
	}
	
	public WebElement getToggleButton() {
		this.driver=getDriver();
		return driver.findElement(toggleButton);
	}
	
	public WebElement getHomePage() {
		this.driver=getDriver();
		return driver.findElement(homePage);
	}
	
	public WebElement getAccordions() {
		this.driver=getDriver();
		return driver.findElement(accordion);
	}
	
	public WebElement getActions() {
		this.driver=getDriver();
		return driver.findElement(actions);
	}
	
	public WebElement getBrowserTabs() {
		this.driver=getDriver();
		return driver.findElement(browserTabs);
	}
	
	public WebElement getButtons() {
		this.driver=getDriver();
		return driver.findElement(buttons);
	}
	
	public WebElement getCalculator() {
		this.driver=getDriver();
		return driver.findElement(calculator);
	}
	
	public WebElement getContactUsForm() {
		this.driver=getDriver();
		return driver.findElement(contactUsForm);
	}
	
	public WebElement getDatePicker() {
		this.driver=getDriver();
		return driver.findElement(datePicker);
	}
	
	public WebElement getDropdownCheckboxRadio() {
		this.driver=getDriver();
		return driver.findElement(dropdownCheckboxRadio);
	}
	
	public WebElement getFileUpload() {
		this.driver=getDriver();
		return driver.findElement(fileUpload);
	}
	
	public WebElement getHiddenElements() {
		this.driver=getDriver();
		return driver.findElement(hiddenElements);
	}
	
	public WebElement getIFrames() {
		this.driver=getDriver();
		return driver.findElement(iFrames);
	}
	
	public WebElement getLoader() {
		this.driver=getDriver();
		return driver.findElement(loader);
	}
	
	public WebElement getLoader2() {
		this.driver=getDriver();
		return driver.findElement(loader2);
	}
	
	public WebElement getLoginPortal() {
		this.driver=getDriver();
		return driver.findElement(loginPortal);
	}
	
	public WebElement getMouseMovement() {
		this.driver=getDriver();
		return driver.findElement(mouseMovement);
	}
	
	public WebElement getPopupsAndAlerts() {
		this.driver=getDriver();
		return driver.findElement(popupsAndAlerts);
	}
	
	public WebElement getPredtictiveSearch() {
		this.driver=getDriver();
		return driver.findElement(predtictiveSearch);
	}
	
	public WebElement getTables() {
		this.driver=getDriver();
		return driver.findElement(tables);
	}
	
	public WebElement getTestStore() {
		this.driver=getDriver();
		return driver.findElement(testStore);
	}
	
	public WebElement getAboutMe() {
		this.driver=getDriver();
		return driver.findElement(aboutMe);
	}
	
	public WebElement getCookie() {
		this.driver=getDriver();
		return driver.findElement(cookie);
	}
}
