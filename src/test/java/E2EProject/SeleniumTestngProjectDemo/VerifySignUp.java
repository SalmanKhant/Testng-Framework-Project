package E2EProject.SeleniumTestngProjectDemo;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.Test;

import PageObjectModels.SignUpPagePOM;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignUp extends BaseClass {

	@Test
	public void enterCredential() {
		SignUpPagePOM obj= new SignUpPagePOM(driver);
		
		obj.clickbutton().click();
		driver.get("https://www.salesforce.com/form/trial/freetrial.jsp?d=70130000000Enus");
		obj.GetFirstName().sendKeys(Constants.FirstName);
		obj.GetLastName().sendKeys(Constants.LastName);
		obj.JobTitle().sendKeys(Constants.Job);
		obj.UserEmail().sendKeys(Constants.Email);
		obj.UserPhone().sendKeys(Constants.Phone);
		Select S=new Select(obj.SelectEmployee());
		S.selectByIndex(1);
		obj.CompanyName().sendKeys(Constants.Company);
		Select C=new Select(obj.SelectCountry());
		C.selectByVisibleText(Constants.Country);
		obj.CheckBox().click();
		}
}
