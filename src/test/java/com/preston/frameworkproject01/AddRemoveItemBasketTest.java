package com.preston.frameworkproject01;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.Hooks;
import PageObjects.CartPanelPage;
import PageObjects.HomePage;
import PageObjects.ShopHomePage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;

@Listeners(Resources.Listeners.class)
public class AddRemoveItemBasketTest extends Hooks{

	public AddRemoveItemBasketTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	@Test
	public void addRemoveItem() throws InterruptedException, IOException{
		HomePage home=new HomePage();
		home.getCookie().click();
		home.getTestStore().click();
		
		ShopHomePage shopHome=new ShopHomePage();
		shopHome.getProductOne().click();
		
		ShopProductPage shopProd=new ShopProductPage();
		Select sizeOptions=new Select(shopProd.getSizeSelectOption());
		sizeOptions.selectByVisibleText("M");
		Thread.sleep(5000);//If we immediately switch quantity after updating size, since the value on FE is not updated the count does not update
		shopProd.getQuantityIncreaseBtn().click();
		shopProd.getAddToCartButton().click();
		
		CartPanelPage cartPanel=new CartPanelPage();
		cartPanel.getContinueShoppingButton().click();
		
		shopProd.getHomeLink().click();
		
		shopHome.getProductTwo().click();
		
		shopProd.getAddToCartButton().click();
		
		cartPanel.getProceedToCheckoutButton().click();
		
		ShoppingCart cart=new ShoppingCart();
		cart.getProductTwoRemoveButton().click();
		
		waitForInvisibilityOfElement(cart.getProductTwoRemoveButton(),10);
		
		String cartValue=cart.getCartTotalValue().getText();
		Assert.assertEquals(cartValue, "$45.24");
	}
	
}
