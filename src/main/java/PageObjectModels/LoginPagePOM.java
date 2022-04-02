package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePOM {
	public WebDriver driver;
	private By username=By.xpath("//input[@name='username']");
	private By passward=By.xpath("//input[@name='pw']");
	private By login=By.xpath("//input[@name='Login']");
	
	
	
	public LoginPagePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement getUsername() {
		return driver.findElement(username);
		
	}
	public WebElement getPassword() {
		return driver.findElement(passward);
		
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
		
	}
		
	}

