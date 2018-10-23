package com.mfaisalkhatri.citests.tests;

import java.io.IOException;

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

}
