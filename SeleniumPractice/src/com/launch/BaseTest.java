package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static String projectPath=System.getProperty("user.dir");
	
	public static void  init() throws IOException
	{
		//FileInputStream fis=new FileInputStream("C:\\Users\\navya\\eclipse-workspace\\SeleniumPractice\\data.properties");
		FileInputStream fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get("https://www.amazon.com");
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 //driver.get("https://www.amazon.com");
		}
	}
	
	public static void navigateUrl(String url) 
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
	}

}
