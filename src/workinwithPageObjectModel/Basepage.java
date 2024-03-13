package workinwithPageObjectModel;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
//Step1 Create constructor 
	public Basepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
		//PageFactory.initElements(driver,this);
		@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
		private WebElement booklink;

		@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
		private WebElement computerlink;
		@FindBy(xpath = "(//a[contains(text(),'Desktops')])[1]")
		private WebElement  desktoplink;
		@FindBy(xpath = "(//a[contains(text(),'Notebooks')])[1]")
	private WebElement notebooklink;
		@FindBy(xpath = "(//a[contains(text(),'Accessories')])[1]")
		private WebElement Accessorieslink;
		
		@FindBy(xpath = "//a[text()='Log in']")
		private WebElement loginlink;
		public WebElement getLoginlink() {
			return loginlink;
		}
		public WebElement getShoppingCartLink() {
			return shoppingCartLink;
		}
		public WebElement getWishlistlink() {
			return wishlistlink;
		}
		public WebElement getSearchtext() {
			return searchtext;
		}
		public WebElement getSearchbutton() {
			return searchbutton;
		}
		public WebElement getSubscribebutton() {
			return subscribebutton;
		}
		public WebElement getSitemaplink() {
			return sitemaplink;
		}
		public WebElement getOrders() {
			return orders;
		}


		@FindBy(linkText = "Shopping cart'")
		private WebElement shoppingCartLink;
		@FindBy(linkText  = "Wishlist")
		private WebElement wishlistlink;
		@FindBy(xpath = "//input[@id='small-searchterms']")
		private WebElement searchtext;
		@FindBy(xpath = "//input[@value='Search']")
		private WebElement searchbutton;
		@FindBy(xpath = "//input[@value='Subscribe']")
		private WebElement subscribebutton;
		@FindBy(xpath = "//a[text()='Sitemap']")
		private WebElement sitemaplink;
		@FindBy(xpath = "//a[text()='Orders']")
		private WebElement orders;
		
		
		public WebElement getBooklink() {
			return booklink;
		}
		public WebElement getComputerlink() {
			return computerlink;
		}
		public WebElement getDesktoplink() {
			return desktoplink;
		}
		public WebElement getNotebooklink() {
			return notebooklink;
		}
		public WebElement getAccessorieslink() {
			return Accessorieslink;
		}


		
}
