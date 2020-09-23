package scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test(enabled=true)
	public void testEveningDressesPurchase() {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		p.clickDresses();
		p.clickEveningDresses();
		p.clickDressColor();
		p.clickAddToCart();
		p.clickViewShoppCart();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
		
	}
	@Test(enabled=true)
	public void testTShirtsPurchase() {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		
		p.clickTShirtsMenu();
		p.clickBlColorShirt();
		
		p.clickAddToCart();
		p.clickViewShoppCart();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
	}
	@Test(enabled=true)
	public void testWomenBlouse() {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		
		p.clickWomenMenu();
		p.selTopsImageBtnMenu();
		p.selBlousesImageBtnMenu();
		p.selBlouseColor();
		
		p.clickAddToCart();
		p.clickViewShoppCart();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
				
	}
	@Test(enabled=true)
	public void testWomenSummerDress() throws InterruptedException {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		BasePage.verifyTitle("My account - My Store");
		
		p.clickWomenMenu();
		p.sOpenTopsMenu();
		p.selSummDress();
		
		p.clickAddToCart();
		Thread.sleep(2000);
		p.clickAlertWindowChkoutBtn();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
		
	}
	@Test(enabled=true)
	public void testChiffonDressSize() throws AWTException, InterruptedException {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		BasePage.verifyTitle("My account - My Store");
		
		p.clickWomenMenu();
		p.clickSelAllSpecials();
		p.selChiffonColor();
		p.selectChiffonSize(); 
		
		p.clickAddToCart();
		Thread.sleep(2000);
		p.clickAlertWindowChkoutBtn();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
		
		
	}
	@Test(enabled=true)
	public void testMouseHover() throws InterruptedException, AWTException {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		BasePage.verifyTitle("My account - My Store");	
		
		GenericUtils.hover(driver, driver.findElement(By.xpath("//a[@title='Women']")));
		Thread.sleep(2000);
		p.clickSummerDressesMenu();
		p.selWhteYellSummerDressBtn();
		//Thread.sleep(2000);
		//p.selWhteYellSummerDressImage();
		p.selectChiffonSize();
		
		p.clickAddToCart();
		Thread.sleep(2000);
		p.clickAlertWindowChkoutBtn();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
	}
	@Test(enabled=true)
	public void test7HoverTwice() throws InterruptedException, AWTException {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		
		GenericUtils.hover(driver, driver.findElement(By.xpath("//a[@title='Women']")));
		Thread.sleep(2000);
		p.selBousesMenuLink();
		p.clickWhiteBlouseBtn();
		p.selectProdSize();
		p.clickAddToCart();
		Thread.sleep(2000);
		p.selContShoppingBtn();
		GenericUtils.hover(driver, driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")));
		Thread.sleep(2000);
		p.selCasualDressesMenu();
		p.selOrangeDress();
		p.selectProdSize();
		
		p.clickAddToCart();
		Thread.sleep(2000);
		p.clickAlertWindowChkoutBtn();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
							
	}
	@Test(enabled=true)
	public void test8CompareDresses() throws InterruptedException, AWTException {
		HomePage p = new HomePage(driver);
		p.clickSignIn();
		p.enterEmailAddress("salimalsharif1@gmail.com");
		p.setPassword("leen1");
		p.clickLogin();
		
		GenericUtils.hover(driver, driver.findElement(By.xpath("//a[@title='Women']")));
		Thread.sleep(2000);
		p.clickSummerDressesMenu();
		p.clickViewByList();
		p.selCompare3rdItem();
		p.selCompare1stItem();
		p.clickCompareBtn();
		p.clickViewOfPrtSumDress();
		p.selAddQuantityBtn();
		p.selectChiffonSize();
		p.clickAddToCart();
		Thread.sleep(2000);
		p.selContShoppingBtn();
		p.clickColorBlueOfDress();
		
		p.clickAddToCart();
		Thread.sleep(2000);
		p.clickAlertWindowChkoutBtn();
		p.clickProcToChkOutBtn();
		p.clickAgreeTermsOfSvceBtn();
		p.clickProceedToChkOutBTn();
		p.clickBankWireBtn();
		p.clickConfirmOrderBtn();
		p.clickSignOutBtn();
	}

}
