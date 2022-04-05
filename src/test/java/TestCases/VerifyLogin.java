package TestCases;

import org.testng.annotations.Test;

import PageObjectModels.LoginPagePOM;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass {
	
	@Test
	
	public void enterCredentials() {
		LoginPagePOM obj= new LoginPagePOM(driver);
		obj.getUsername().sendKeys("Admin");
		obj.getPassword().sendKeys("Admin123");
		obj.clicklogin().click();
	}

}
