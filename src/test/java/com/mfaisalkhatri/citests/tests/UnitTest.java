package com.mfaisalkhatri.citests.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.configreader.configreader.main.PropertiesReader;

/**
 * @author Faisal Khatri
 *
 */
public class UnitTest {

	/**
	 * This is unit test for propertiesreader dependency.
	 * 
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {

		PropertiesReader prop = new PropertiesReader();
		String websiteValue = prop.getKey("website");
		String searchText = prop.getKey("search");
		System.out.println("Website is: " + websiteValue);
		System.out.println("Search Text is : " + searchText);

	}

	@Test
	public void browserTest() throws IOException {

		WebDriver driver;
		PropertiesReader prop = new PropertiesReader();
		String websiteValue = prop.getKey("website");
		String searchText = prop.getKey("search");

		OSCheck os = new OSCheck();
		os.setup();

		driver = new ChromeDriver();
		driver.get(websiteValue);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1024, 768));

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchText);

		WebElement srchBtn = driver.findElement(By.name("btnK"));
		srchBtn.click();

		driver.quit();

	}

}
