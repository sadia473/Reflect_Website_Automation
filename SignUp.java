package com.bd.Automation;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class SignUp extends DriverSetup {
	
public static String baseUrl="https://reflect.run/articles/demo-websites/";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/div[1]/nav[2]/div[3]/a[2]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Md");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Al-amin");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("alamin01116126@wpforms.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/input[1]")).sendKeys("ZooBook systems llc");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/input[1]")).sendKeys("011161268");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("")).sendKeys("011161268");
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		Thread.sleep(4000);
		
		
		
	}


}


