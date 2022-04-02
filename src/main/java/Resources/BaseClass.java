package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	/*public WebDriver driver;
	public WebDriver initializer() throws IOException {
		Properties pro= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Salman Khan\\eclipse-workspace\\SeleniumTestngProjectDemo\\src\\main\\java\\Resources\\Data.Properties");
		pro.load(file);
		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Salman Khan\\Desktop\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.out.println("Please select any browser");
		}
		return driver;
	}
	

}*/
public WebDriver driver;	//public void webdriver

Properties prop = new Properties();
public WebDriver initializeDriver() throws IOException {

	FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.Properties");

	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if (browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");

		driver = new ChromeDriver();

	} else if (browserName.equals("firefox")) {

		// Firefox code

	} else if (browserName.equals("IE")) {
		// IE code

	} else {
		System.out.println("please select any browser");
	}
	return driver;

}
@BeforeMethod
public void UrlLaunch() throws IOException {
	driver= initializeDriver();
	driver.get(prop.getProperty("url"));
	//driver.get("https://www.salesforce.com/form/trial/freetrial.jsp?d=70130000000Enus");
}
}