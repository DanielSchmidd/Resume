package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POs.LoginFormPO;
import POs.LoginSuccessPO;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DriverLifeCycleSetting {


	protected WebDriver driver;

		
	
		@BeforeAll
		public static void beforeAll() {
			WebDriverManager.chromedriver().setup();	
		}
		
		@BeforeEach
		public void beforeEach() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		
		@AfterEach
		public void afterEach() {
			if (driver != null) {
				driver.quit();
			}
		}
		
}