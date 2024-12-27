package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
	public WebDriver driver;
	
	By haveAPromoLink=By.xpath("//a[contains(text(),'promo')]");
	By promoCodeInput=By.xpath("//input[@name='discount_name']");
	By addPromoCode=By.xpath("//button//span[text()='Add']");
	By proceedToCheckoutButton=By.xpath("//a[text()='Proceed to checkout']");
	By productOneRemoveButton=By.cssSelector("li.cart-item:nth-child(1) a.remove-from-cart");
	By productTwoRemoveButton=By.cssSelector("li.cart-item:nth-child(2) a.remove-from-cart");
	By cartTotalValue=By.cssSelector(".cart-total span.value");
	
	public ShoppingCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getHaveAPromoCodeLink() {
		return driver.findElement(haveAPromoLink);
	}
	
	public WebElement getPromoCodeInput() {
		return driver.findElement(promoCodeInput);
	}
	
	public WebElement getPromoCodeAddBtn() {
		return driver.findElement(addPromoCode);
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(proceedToCheckoutButton);
	}
	
	public WebElement getProductOneRemoveButton() {
		return driver.findElement(productOneRemoveButton);
	}
	
	public WebElement getProductTwoRemoveButton() {
		return driver.findElement(productTwoRemoveButton);
	}
	
	public WebElement getCartTotalValue() {
		return driver.findElement(cartTotalValue);
	}
}