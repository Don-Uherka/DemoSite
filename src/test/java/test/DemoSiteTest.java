package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class DemoSiteTest {
	
	static WebDriver driver;
	
	
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
	}
	
	@Before
	public void setup() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			driver.get(HomePage.getUrl());
		} catch(TimeoutException e) {
			System.out.println("NOT WORKING");
		}
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
	@Test
	public void test() {
		
	}
}
