package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class CartPanelPage extends BasePage{
	public WebDriver driver;
	
	By continueShoppingButton=By.xpath("//button[.='Continue shopping']");//Context Item Expression .=
	By proceedToCheckoutButton=By.xpath("//a[contains(text(),'Proceed')]");
	
	public CartPanelPage() throws IOException {
		super();
	}
	
	public WebElement getContinueShoppingButton() {
		this.driver=getDriver();
		return driver.findElement(continueShoppingButton);
	}
	
	public WebElement getProceedToCheckoutButton() {
		this.driver=getDriver();
		return driver.findElement(proceedToCheckoutButton);
	}
	
}
