package com.bd.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateTest extends DriverSetup{
	
public static String baseUrl="https://app.reflect.run/tests";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='app']/form[1]/div[1]/div[1]/section[1]/form[1]/input[1]")).sendKeys("alamin01116126@wpforms.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='app']/form[1]/div[1]/div[1]/section[1]/form[1]/input[2]")).sendKeys("011161268");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in with Email')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/div[2]/input[1]")).sendKeys("TC_CreateTest_001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/r-tabs[1]/r-tab-panes[1]/r-tab-pane[1]/div[1]/div[1]/input[1]")).sendKeys("https://app.reflect.run/tests");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/r-tabs[1]/r-tab-panes[1]/r-tab-pane[1]/div[1]/div[2]/select[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/r-tabs[1]/r-tab-panes[1]/r-tab-pane[1]/div[1]/div[2]/select[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Begin Recording')]")).click();
		Thread.sleep(14000);
		
		
		

		
	}

}
