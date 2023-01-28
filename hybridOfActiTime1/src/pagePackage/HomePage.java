package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath="") private WebElement users;
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}

//operational methods

public void logOut()
{
	logoutLink.click();
}

public void clickOnUsers()
{
	users.click();
}

public void clickOnSaveLeaveTime()
{
	saveLeaveTimeButton.click();
}

public void selectedUser(int index)
{
	Select sel = new Select(enterTimeTrackDropdown);
	
			sel.selectByIndex(index);
}

public void ClickOnUser()
{
	users.click();
}
}
