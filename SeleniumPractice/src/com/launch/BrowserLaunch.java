package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navya\\Documents\\Softwares\\JAR Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\navya\\Documents\\Softwares\\JAR Files\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.bestbuy.com");

	}

}
