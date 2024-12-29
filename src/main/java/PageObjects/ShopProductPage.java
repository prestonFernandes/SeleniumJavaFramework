package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopProductPage extends BasePage{
	public WebDriver driver;
	
	By sizeSelectOption=By.xpath("//select[@aria-label='Size']");
	By quantityIncrease=By.cssSelector("button i.touchspin-up");
	By quantityDecrease=By.cssSelector("button i.touchspin-down");
	By addToCartButton=By.xpath("//button[@data-button-action='add-to-cart']");
	By homeLink=By.xpath("//span[.='Home']");
	
	public ShopProductPage() throws IOException {
		super();
	}
	
	public WebElement getSizeSelectOption() {
		this.driver=getDriver();
		return driver.findElement(sizeSelectOption);
	}
	
	public WebElement getQuantityIncreaseBtn() {
		this.driver=getDriver();
		return driver.findElement(quantityIncrease);
	}
	
	public WebElement getQuantityDecreaseBtn() {
		this.driver=getDriver();
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement getAddToCartButton() {
		this.driver=getDriver();
		return driver.findElement(addToCartButton);
	}
	
	public WebElement getHomeLink() {
		this.driver=getDriver();
		return driver.findElement(homeLink);
	}
}
