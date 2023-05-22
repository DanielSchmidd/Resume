package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POs.LoginFormPO;
import POs.LoginSuccessPO;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BasicLoginTest extends DriverLifeCycleSetting {

private LoginFormPO login;
private LoginSuccessPO loginSuccess;

		
		
		@Test
		 public void testLoginOK() { 
			login = new LoginFormPO(driver);
			loginSuccess = (LoginSuccessPO) login.with("user", "user");
			assertTrue(loginSuccess.successBoxIsPresent());
		}
			
		
		@Test
		public void testLoginNoOK() {
			login = new LoginFormPO(driver);
			login.with("user", "error");
			assertTrue(login.invalidBoxIsPresent());
		}
}



