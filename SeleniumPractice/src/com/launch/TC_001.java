package com.launch;

import java.io.IOException;

public class TC_001  extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		//driver.close(); //close will close the current active window which is opened by the web driver
		
		driver.quit(); // all the consecutive windows opened by the web browser got closed
	}

	
}
