package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtitlityClass {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch() {
		driver=new ChromeDriver();
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
}
}
