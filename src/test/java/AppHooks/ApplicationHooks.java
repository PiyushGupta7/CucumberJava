package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.Factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader cr;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
	    cr=new ConfigReader();
		prop=cr.init_prop();
		
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browser=prop.getProperty("browser");
		driver=DriverFactory.init_driver(browser);
	   	
	}
	
	@After(order=1)
	public void teardown() {
		
		
		driver.quit();
	   
		
	}
	

}
