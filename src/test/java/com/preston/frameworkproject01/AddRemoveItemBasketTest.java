package com.preston.frameworkproject01;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import PageObjects.CartPanelPage;
import PageObjects.HomePage;
import PageObjects.ShopHomePage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;

public class AddRemoveItemBasketTest extends BasePage{

	public AddRemoveItemBasketTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup() {
		driver=getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		driver=null;
	}
	
	@Test
	public void addRemoveItem() throws InterruptedException{
		HomePage home=new HomePage(driver);
		home.getCookie().click();
		home.getTestStore().click();
		
		ShopHomePage shopHome=new ShopHomePage(driver);
		shopHome.getProductOne().click();
		
		ShopProductPage shopProd=new ShopProductPage(driver);
		Select sizeOptions=new Select(shopProd.getSizeSelectOption());
		sizeOptions.selectByVisibleText("M");
		Thread.sleep(5000);//If we immediately switch quantity after updating size, since the value on FE is not updated the count does not update
		shopProd.getQuantityIncreaseBtn().click();
		shopProd.getAddToCartButton().click();
		
		CartPanelPage cartPanel=new CartPanelPage(driver);
		cartPanel.getContinueShoppingButton().click();
		
		shopProd.getHomeLink().click();
		
		shopHome.getProductTwo().click();
		
		shopProd.getAddToCartButton().click();
		
		cartPanel.getProceedToCheckoutButton().click();
		
		ShoppingCart cart=new ShoppingCart(driver);
		cart.getProductTwoRemoveButton().click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(cart.getProductTwoRemoveButton()));
		String cartValue=cart.getCartTotalValue().getText();
		Assert.assertEquals(cartValue, "$45.24");
	}
	
}
