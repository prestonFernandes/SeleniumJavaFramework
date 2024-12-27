package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
	public WebDriver driver;
	
	By sizeSelectOption=By.xpath("//select[@aria-label='Size']");
	By quantityIncrease=By.cssSelector("button i.touchspin-up");
	By quantityDecrease=By.cssSelector("button i.touchspin-down");
	By addToCartButton=By.xpath("//button[@data-button-action='add-to-cart']");
	By homeLink=By.xpath("//span[.='Home']");
	
	public ShopProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getSizeSelectOption() {
		return driver.findElement(sizeSelectOption);
	}
	
	public WebElement getQuantityIncreaseBtn() {
		return driver.findElement(quantityIncrease);
	}
	
	public WebElement getQuantityDecreaseBtn() {
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(addToCartButton);
	}
	
	public WebElement getHomeLink() {
		return driver.findElement(homeLink);
	}
}
