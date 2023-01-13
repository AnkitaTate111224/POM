package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BrowserStckDashboardPage {
// Object Repository
	WebDriver driver;
	//By UserProfileBtn = By.xpath("//button[@id='account-menu-toggle']");
	//By Summary = By.xpath("//a[text()='Summary']");
	//By UserFullName = By.xpath("(//span[@class='profile-details-card__list-item-value-text'])[1]");
	
	@FindBy(xpath = "//button[@id='account-menu-toggle']")
	WebElement UserProfileBtn;
	
	@FindBy(xpath = "//a[text()='Summary']")
	WebElement Summary;

	@FindBy(xpath = "(//span[@class='profile-details-card__list-item-value-text'])[1]")
	WebElement UserFullName;
	
// Constructor
	public BrowserStckDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
// Methods
	public void UserProfileClick() {
		Actions act = new Actions(driver);
		act.moveToElement(UserProfileBtn).perform();
//		UserProfileBtn.click();
	}
	public void ClickonSummary() {
		Summary.click();
	}
	public String verifyUserName() {
		String getUserText = UserFullName.getText();
		return getUserText;
	}
}
