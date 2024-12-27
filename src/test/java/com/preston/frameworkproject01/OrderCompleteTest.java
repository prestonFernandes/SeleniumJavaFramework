package com.preston.frameworkproject01;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import PageObjects.CartPanelPage;
import PageObjects.HomePage;
import PageObjects.OrderFormAddress;
import PageObjects.OrderFormPaymentInfo;
import PageObjects.OrderFormPersonalInformation;
import PageObjects.OrderFormShippingInfo;
import PageObjects.ShopHomePage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;

@Listeners(Resources.Listeners.class)
public class OrderCompleteTest extends BasePage{

	public OrderCompleteTest() throws IOException {
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
//		driver=null;
	}
	
	@Test
	public void endToendTest() throws InterruptedException {
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
		cartPanel.getProceedToCheckoutButton().click();
		
		ShoppingCart cart=new ShoppingCart(driver);
		cart.getHaveAPromoCodeLink().click();
		cart.getPromoCodeInput().sendKeys("20OFF");
		cart.getPromoCodeAddBtn().click();
		
		Thread.sleep(5000);
		cart.getProceedToCheckoutButton().click();
		
		OrderFormPersonalInformation personalInfo=new OrderFormPersonalInformation(driver);
		personalInfo.getMrsRadioButton().click();
		personalInfo.getMrRadioButton().click();
		
		personalInfo.getFirstNameInputField().sendKeys("MyFirstName");
		personalInfo.getLastNameInputField().sendKeys("MyLastName");
		personalInfo.getEmailInputField().sendKeys("myname@email.com");
		personalInfo.getTermsAndConditionsCheckbox().click();
		personalInfo.getContinueButton().click();
		
		OrderFormAddress orderAddress=new OrderFormAddress(driver);
		orderAddress.getAddressField().sendKeys("212 Beverly Hills");
		orderAddress.getCityField().sendKeys("Boulevard");
		Select state=new Select(orderAddress.getStateSelectionField());
		state.selectByVisibleText("Arizona");
		orderAddress.getPostalCodeField().sendKeys("33304");
		Thread.sleep(3000);
		orderAddress.getContinueButton().click();
		Thread.sleep(3000);
		
		OrderFormShippingInfo orderShip=new OrderFormShippingInfo(driver);
		orderShip.getCommentField().sendKeys("Please handled with care");
		orderShip.getContinueButton().click();
		
		OrderFormPaymentInfo paymentInfo=new OrderFormPaymentInfo(driver);
		paymentInfo.getPayByChequeRadioButton().click();
		paymentInfo.getTermsOfServiceCheckbox().click();
		paymentInfo.getPlaceOrderButton().click();
		Thread.sleep(10000);
	}

}
