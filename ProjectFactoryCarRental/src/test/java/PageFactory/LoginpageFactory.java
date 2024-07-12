package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageFactory {
	
	WebDriver driver;
	
	@FindBy(id ="email")
	WebElement txt_username;
	
	@FindBy(id ="password")
	WebElement txt_password;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement btn_login;
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLoginButton() {
		btn_login.click();
	}
	
	public LoginpageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}

