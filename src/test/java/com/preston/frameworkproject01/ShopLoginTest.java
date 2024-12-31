package com.preston.frameworkproject01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import PageObjects.ShopSignInPage;
import PageObjects.ShopYourAccountPage;
import PageObjects.ShoppingCart;

@Listeners(Resources.Listeners.class)
public class ShopLoginTest extends Hooks{

	public ShopLoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	@Test
	public void addRemoveItem() throws InterruptedException, IOException{
		HomePage home=new HomePage();
		home.getCookie().click();
		home.getTestStore().click();
		
		ShopHomePage shopHome=new ShopHomePage();
		shopHome.getSignInButton().click();
		
		FileInputStream workBook=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\credentials.xlsx");
		
		XSSFWorkbook wkbk=new XSSFWorkbook(workBook);
		XSSFSheet sheet=wkbk.getSheetAt(0);
		ShopSignInPage shopSignIn=new ShopSignInPage();
		ShopYourAccountPage acctPage=new ShopYourAccountPage();
		
		ArrayList<String> failedCreds=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			Row row=sheet.getRow(i);
			Cell cell0=row.getCell(0);//email
			Cell cell1=row.getCell(1);//password
			
			String emailRow=cell0.toString();
			String passwordRow=cell1.toString();
			
			shopSignIn.getEmailInputField().clear();
			shopSignIn.getEmailInputField().sendKeys(emailRow);
			shopSignIn.getPasswordInputField().clear();
			shopSignIn.getPasswordInputField().sendKeys(passwordRow);
			shopSignIn.getSignInButton().click();
			
			
			
			try {
				if(i==1) {
					shopHome.getMyAccountLink().click();
				}
				acctPage.getSignOutButton().click();
				
			}catch(Exception e) {
				takeScreenshot(emailRow);
				failedCreds.add(emailRow);
			}
			
			
		}
		System.out.println(failedCreds);
		if(failedCreds.size()>0) {
			Assert.fail("Some creds did not work");
		}
		
//		Row row1=sheet.getRow(1);
//		Cell cell0=row1.getCell(0);//email
//		Cell cell1=row1.getCell(1);//password
//		
//		String emailRow1=cell0.toString();
//		String passwordRow1=cell1.toString();
//		
//		System.out.println(emailRow1);
//		System.out.println(passwordRow1);
//		
//		ShopSignInPage shopSignIn=new ShopSignInPage();
//		shopSignIn.getEmailInputField().sendKeys(emailRow1);
//		shopSignIn.getPasswordInputField().sendKeys(passwordRow1);
//		shopSignIn.getSignInButton().click();
//		shopHome.getMyAccountLink().click();
//		//MY Account Page
//		ShopYourAccountPage acctPage=new ShopYourAccountPage();
//		acctPage.getHomeLink().click();
//		shopHome.getSignOutButton().click();
		
	}
	
}
