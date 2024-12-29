package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShoppingCart extends BasePage {
	public WebDriver driver;
	
	By haveAPromoLink=By.xpath("//a[contains(text(),'promo')]");
	By promoCodeInput=By.xpath("//input[@name='discount_name']");
	By addPromoCode=By.xpath("//button//span[text()='Add']");
	By proceedToCheckoutButton=By.xpath("//a[text()='Proceed to checkout']");
	By productOneRemoveButton=By.cssSelector("li.cart-item:nth-child(1) a.remove-from-cart");
	By productTwoRemoveButton=By.cssSelector("li.cart-item:nth-child(2) a.remove-from-cart");
	By cartTotalValue=By.cssSelector(".cart-total span.value");
	
	public ShoppingCart(WebDriver driver) throws IOException {
		super();
	}
	
	public WebElement getHaveAPromoCodeLink() {
		this.driver=getDriver();		
		return driver.findElement(haveAPromoLink);
	}
	
	public WebElement getPromoCodeInput() {
		this.driver=getDriver();
		return driver.findElement(promoCodeInput);
	}
	
	public WebElement getPromoCodeAddBtn() {
		this.driver=getDriver();
		return driver.findElement(addPromoCode);
	}
	
	public WebElement getProceedToCheckoutButton() {
		this.driver=getDriver();
		return driver.findElement(proceedToCheckoutButton);
	}
	
	public WebElement getProductOneRemoveButton() {
		this.driver=getDriver();
		return driver.findElement(productOneRemoveButton);
	}
	
	public WebElement getProductTwoRemoveButton() {
		this.driver=getDriver();
		return driver.findElement(productTwoRemoveButton);
	}
	
	public WebElement getCartTotalValue() {
		this.driver=getDriver();
		return driver.findElement(cartTotalValue);
	}
}
