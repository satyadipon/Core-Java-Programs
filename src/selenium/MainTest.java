package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/satya/Downloads/selenium-util/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
	}

}
