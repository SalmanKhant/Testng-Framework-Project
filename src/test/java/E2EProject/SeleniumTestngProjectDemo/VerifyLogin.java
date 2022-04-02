package E2EProject.SeleniumTestngProjectDemo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModels.LoginPagePOM;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass {
	@BeforeTest
	public void urlLAunch() throws IOException {

		driver = initializeDriver();
		driver.get("https://login.salesforce.com/");

	}
	@Test
	public void enterCredentials() {
		LoginPagePOM obj= new LoginPagePOM(driver);
		obj.getUsername().sendKeys("Admin");
		obj.getPassword().sendKeys("Admin123");
		obj.clicklogin().click();
	}

}