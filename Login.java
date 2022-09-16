package com.bd.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends DriverSetup{

	
	
public static String baseUrl="https://reflect.run/articles/demo-websites/";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//header/div[1]/nav[2]/div[2]/a[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='app']/form[1]/div[1]/div[1]/section[1]/form[1]/input[1]")).sendKeys("alamin01116126@wpforms.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='app']/form[1]/div[1]/div[1]/section[1]/form[1]/input[2]")).sendKeys("011161268");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in with Email')]")).click();
		Thread.sleep(9000);
		
	}
}
