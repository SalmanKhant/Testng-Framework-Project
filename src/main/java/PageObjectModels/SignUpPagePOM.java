package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPagePOM {
	//Sign-up Testing
	public WebDriver driver;
	private By button=By.xpath("//a[@id='signup_link']");
	private By ufname=By.xpath("//input[@name='UserFirstName']");
	private By ulname= By.xpath("//input[@name='UserLastName']");
	private By jobtitle= By.xpath("//input[@name='UserTitle']");
	private By uemail= By.xpath("//input[@name='UserEmail']");
	private By uphone= By.xpath("//input[@name='UserPhone']");
	private By comname= By.xpath("//input[@name='CompanyName']");
	private By empname= By.xpath("//select[@name='CompanyEmployees']");
	private By cont= By.xpath("//select[@name='CompanyCountry']");
	private By cbox= By.xpath("//div[@class='checkbox-ui']");
	

	public SignUpPagePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement clickbutton() {
		return driver.findElement(button);
		
	}
	public WebElement GetFirstName() {
		return driver.findElement(ufname);
		
	}
	public WebElement GetLastName() {
		return driver.findElement(ulname);
		
	}
	public WebElement JobTitle() {
		return driver.findElement(jobtitle);
		
	}
	public WebElement UserEmail() {
		return driver.findElement(uemail);
		
	}
	public WebElement UserPhone() {
		return driver.findElement(uphone);
		
	}
	public WebElement CompanyName() {
		return driver.findElement(comname);
		
	}
	public WebElement SelectEmployee() {
		return driver.findElement(empname);
		
	}
	public WebElement SelectCountry() {
		return driver.findElement(cont);
		
	}
	public WebElement CheckBox() {
		return driver.findElement(cbox);
		
	}
}
