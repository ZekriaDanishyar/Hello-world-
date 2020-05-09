package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	System.out.print("I love Java Programming");
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", 
		"C:/Users/Zekria/eclipse-workspace/Training-June-2019/CucumberSelenium/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
