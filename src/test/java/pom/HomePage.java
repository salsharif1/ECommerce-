package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		//initialize all elements
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	@FindBy(id="email")
	private WebElement emailAddressTxtBox;
	@FindBy(id="passwd")
	private WebElement pwdTxtBox;
	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	@FindBy(xpath="(//ul/li[2]//a[1][.='Dresses'])[2]")
	private WebElement dresses_Menu;
	@FindBy(xpath="(//li[2]//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]")
	private WebElement eveningDresses;
	@FindBy(xpath="//a[@id='color_16']")
	private WebElement selectDressColor;
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addToCart;
	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement viewShoppCart;
	@FindBy(xpath="//span[.='Proceed to checkout']")
	private WebElement procToChkOutBtn;
	@FindBy(xpath="//label[text()='I agree to the terms of service and will adhere to them unconditionally.']/../div")
	private WebElement agreeTrmOfSrveBtn;
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceedToChkOutBtn;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement bankWireBtn;
	@FindBy(xpath="//span[.='I confirm my order']")
	private WebElement iConfirmMyOrderBtn;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signOut;
	
	//starting for Test case 2 T-Shirts
	
	@FindBy(xpath="(//ul//li/a[.='T-shirts'])[2]")
	private WebElement sTShirtMenu;
	@FindBy(xpath="//a[@id='color_2']")
	private WebElement selectColorBlu;
	
	//Starting Case 3 Women Blouses
	@FindBy(xpath="//a[@title='Women']")
	private WebElement selWomenMenu;
	@FindBy(xpath="(//a[@class='subcategory-name'])[1]")
	private WebElement selTopsImageBtn;
	@FindBy(xpath="(//a[@title='Match your favorites blouses with the right accessories for the perfect look.'])[1]")
	private WebElement selBlousesMenuBtn;
	@FindBy(xpath="//a[@id='color_7']")
	private WebElement selectBlackColor;
	
	//Test case 4
	@FindBy(xpath="(//li/span[@class='grower CLOSE'])[1]")
	private WebElement openTopsMenu;
	@FindBy(xpath="//a[@id='color_19']")
	private WebElement yellowSummDress;
	@FindBy(xpath="//div/div[4]/a[@title='Proceed to checkout']")
	private WebElement alertWinProceedToChkOut;
	
	//Test case 5
	@FindBy(xpath="//span[text()='All specials']")
	private WebElement selectAllSpecials;
	@FindBy(xpath="//a[@id='color_37']")
	private WebElement greenChiffonDress;
	@FindBy(xpath="//div/fieldset/div/div[@id='uniform-group_1']")
	private WebElement selectSize;
	
	// Test case 6
	@FindBy(xpath="//a[@title='Women']")
	private WebElement hoverOverWomenMenu;
	@FindBy(xpath="(//a[@title='Summer Dresses'])[1]")
	private WebElement selSummerDressesMenu;
	@FindBy(xpath="(//img[@title='Printed Summer Dress'])[3]")
	private WebElement selectSummerDressWhteYell;
	@FindBy(xpath="//a[@id='color_40']")
	private WebElement selWhteYellPrntSummDress;
	
	// Test case 7
	@FindBy(xpath="//a[@title='Blouses']")
	private WebElement selectBlousesMenu;
	@FindBy(xpath="//a[@id='color_8']")
	private WebElement selectWhiteBlouseBtn;
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement selContShoppingBtn;
	@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
	private WebElement selCasualDressMenu;
	@FindBy(xpath="//a[@id='color_13']")
	private WebElement selOrangeDressBtn;
	
	// Test case 8
	@FindBy(xpath="//i[@class='icon-th-list']")
	private WebElement clickViewByListBtn;
	@FindBy(xpath="(//a[@class='add_to_compare'])[3]")
	private WebElement selCompare3rdItem;
	@FindBy(xpath="(//a[@class='add_to_compare'])[1]")
	private WebElement selCompare1stItem;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement clickCompareBtn;
	@FindBy(xpath="(//a[@title='View'])[1]")
	private WebElement clickViewOfPrtSumDress;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement clickAddQuantityBtn;
	@FindBy(xpath="//a[@id='color_14']")
	private WebElement clickBlueDressbtn;
	
	
	public void  clickSignIn() {
		signIn.click();
	}
	public void enterEmailAddress(String em) {
		emailAddressTxtBox.sendKeys(em);
	}
	public void setPassword(String pwd) {
		pwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin() {
		signInBtn.click();
	}
	public void clickDresses() {
		dresses_Menu.click();
	}
	public void clickEveningDresses() {
		eveningDresses.click();
	}
	public void clickDressColor() {
		selectDressColor.click();
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickViewShoppCart() {
		viewShoppCart.click();
				
	}
	public void clickProcToChkOutBtn() {
		procToChkOutBtn.click();
		procToChkOutBtn.click();
	}
	public void clickAgreeTermsOfSvceBtn() {
		agreeTrmOfSrveBtn.click();
	}
	public void clickProceedToChkOutBTn() {
		proceedToChkOutBtn.click();
	}
	public void clickBankWireBtn() {
		bankWireBtn.click();
	}
	public void clickConfirmOrderBtn() {
		iConfirmMyOrderBtn.click();
	}
	public void clickSignOutBtn() {
		signOut.click();
	}
	//Test case 2 T-Shirts
	public void clickTShirtsMenu() {
		sTShirtMenu.click();
	}
	public void clickBlColorShirt() {
		selectColorBlu.click();
	}
	// Case 3
	public void clickWomenMenu() {
		selWomenMenu.click();
	}
	public void selTopsImageBtnMenu() {
		selTopsImageBtn.click();
	}
	public void selBlousesImageBtnMenu() {
		selBlousesMenuBtn.click();
	}
	public void selBlouseColor() {
		selectBlackColor.click();
	}
	public void sOpenTopsMenu() {
		openTopsMenu.click();
	}
	public void selSummDress() {
		yellowSummDress.click();
	}
	public void clickAlertWindowChkoutBtn() {
		alertWinProceedToChkOut.click();
	}
	//Test case 5
	public void clickSelAllSpecials() {
		selectAllSpecials.click();
	}
	public void selChiffonColor() {
		greenChiffonDress.click();
	}
	public void selectChiffonSize() throws AWTException {
		selectSize.click();
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_L);
		 r.keyPress(KeyEvent.VK_ENTER);
	}
	//Test case 6
	
	public void clickSummerDressesMenu() {
		selSummerDressesMenu.click();
	}
	public void selWhteYellSummerDressBtn() {
		selWhteYellPrntSummDress.click();
	}
	public void selWhteYellSummerDressImage() {
		selectSummerDressWhteYell.click();
	}
	// Test case 7
	public void selBousesMenuLink() {
		selectBlousesMenu.click();
	}
	public void clickWhiteBlouseBtn() {
		selectWhiteBlouseBtn.click();
	}
	public void selectProdSize() throws AWTException {
		selectSize.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void selContShoppingBtn() {
		selContShoppingBtn.click();
	}
	public void selCasualDressesMenu() {
		selCasualDressMenu.click();
	}
	public void selOrangeDress() {
		selOrangeDressBtn.click();
	}
	// Test case 8
	public void clickViewByList() {
		clickViewByListBtn.click();
	}
	public void selCompare3rdItem() {
		selCompare3rdItem.click();
	}
	public void selCompare1stItem() {
		selCompare1stItem.click();
	}
	public void clickCompareBtn() {
		clickCompareBtn.click();
	}
	public void clickViewOfPrtSumDress() {
		clickViewOfPrtSumDress.click();
	}
	public void selAddQuantityBtn() {
		clickAddQuantityBtn.click();
	}
	public void clickColorBlueOfDress() {
		clickBlueDressbtn.click();
	}


}
