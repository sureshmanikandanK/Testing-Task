package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class User_Info {

WebDriver driver;

	

	@FindBy(xpath = "//a[contains(text(),'User Info')]")

	WebElement user_Info;

	

	public void User() {

		user_Info.isDisplayed();

	}

	

	public User_Info(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

