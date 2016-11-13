package com.inportia.EmpoweringIndia.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageObject {
     
	String empowering_india_url = "http://empoweringindia.org/new/home.aspx";
    WebDriver driver;	
	
    By find_your_party = By.id("ctl00_HyperLink3");
	
	
	public void go_to_empowering_India()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        
		// open the empowering india page
		driver.get(empowering_india_url);
	}
	
	public void click_on_find_your_party()
	{
		
	}
	
}
