package com.honey.basics;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FirstSeleniumExample {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.westernunion.com/us/en/web/user/register");

//		WebElement firtsName = driver.findElement(By.id("firstName"));
//		firtsName.sendKeys("Honey");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("firstName")).sendKeys("honey");
		Thread.sleep(3000);
		takescreenshotbyname("westernunion_firstname_");
		Thread.sleep(3000);
		driver.findElement(By.id("middleName")).sendKeys("gupta");
		Thread.sleep(3000);
		takescreenshotbyname("westernunion_middlename_");
		driver.findElement(By.id("lastName")).sendKeys("gup");
		Thread.sleep(3000);
		takescreenshotbyname("westernunion_lastname_");
		driver.findElement(By.id("dob")).sendKeys("01111990");
		takescreenshotbyname("westernunion_dob_");

		driver.findElement(By.linkText("Online Privacy Statement")).click();
		driver.findElement(By.partialLinkText("Terms & Conditions")).click();
	}

	public static void takescreenshotbyname(String name) throws Exception {

		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timestamp = df.format(d);
		System.out.println(timestamp);

		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\" + name + timestamp + ".PNG"));
	}
}
