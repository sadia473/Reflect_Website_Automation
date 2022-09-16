package com.bd.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Documentation extends DriverSetup{

	
public static String baseUrl="https://reflect.run/articles/demo-websites/";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//header/div[1]/nav[2]/div[2]/a[2]")).click();
		Thread.sleep(4000);
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to the bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight,);");
		Thread.sleep(7000);
		
		
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		
		
		
		
		
	}
}
