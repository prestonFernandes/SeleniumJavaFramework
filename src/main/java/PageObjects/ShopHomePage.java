package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomePage {
	public WebDriver driver;
	
	//humming bird t-shirt
	By productOne=By.xpath("//img[@alt='Hummingbird printed t-shirt']");
	//humming bird Sweater
	By productTwo=By.xpath("//img[@alt='Brown bear printed sweater']");
	//photFrame1
	By productThree=By.cssSelector("[alt='The best is yet to come\\' Framed poster']");
	//photoFrame2
	By productFour=By.xpath("//img[@alt='The adventure begins Framed poster']");
	//photoFrame3
	By productFive=By.xpath("//img[@alt='Today is a good day Framed poster']");
	//cup1
	By productSix=By.xpath("//img[@alt='Mug The best is yet to come']");
	//cup2
	By productSeven=By.xpath("//img[@alt='Mug The adventure begins']");
	//cup3
	By productEight=By.xpath("//img[@alt='Mug Today is a good day']");
	
	public ShopHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getProductOne() {
		return driver.findElement(productOne);
	}
	
	public WebElement getProductTwo() {
		return driver.findElement(productTwo);
	}
	
	public WebElement getProductThree() {
		return driver.findElement(productThree);
	}
	
	public WebElement getProductFour() {
		return driver.findElement(productFour);
	}
	
	public WebElement getProductFive() {
		return driver.findElement(productFive);
	}
	
	public WebElement getProductSix() {
		return driver.findElement(productSix);
	}
	
	public WebElement getProductSeven() {
		return driver.findElement(productSeven);
	}
	
	public WebElement getProductEight() {
		return driver.findElement(productEight);
	}
}
