package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPanelPage {
	public WebDriver driver;
	
	By continueShoppingButton=By.xpath("//button[.='Continue shopping']");//Context Item Expression .=
	By proceedToCheckoutButton=By.xpath("//a[contains(text(),'Proceed')]");
	
	public CartPanelPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(continueShoppingButton);
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(proceedToCheckoutButton);
	}
	
}
