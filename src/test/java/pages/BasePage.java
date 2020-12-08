package pages;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
 
public class BasePage {
	static WebDriver driver;
	static ConfigFileReader configFileReader = FileReaderManager.getInstance().getConfigReader();
	
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	
	public static void getUrl(String friendlyName) {
			String url = configFileReader.getApplicationUrl(friendlyName);
			driver.get(url);		 
		}

	public static void hardCodedUrl() {
		driver.get("https://www.duckduckgo.com");
	}
	
	public static void enterTextById(String text, String id) {
		driver.findElement(By.id(id)).sendKeys(text);
	}
	
	public static void clickById(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public static void clickByLinkText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public static void checkHeader(String header) {
		boolean headerCorrect = driver.findElement(By.tagName("h1")).getText().equals(header);
		assertTrue(headerCorrect);
	}
	
	public static void checkHeader2(String header) {
		boolean headerCorrect = driver.findElement(By.tagName("h2")).getText().equals(header);
		assertTrue(headerCorrect);
	}
	
	public static void checkUrl(String url) {
		boolean urlCorrect = driver.getCurrentUrl().toString().equals(url);
		assertTrue(urlCorrect);
	}	
	
	public static void radioButtonByElement(WebElement yesElement, WebElement noElement, boolean yesOrNo) {
		if (yesOrNo == true) {
			yesElement.click();
		}
		else if (yesOrNo == false) {
			noElement.click();
		}
		else {
			System.out.println("Selection from radio is undefined");
		}
	}
	
	public static void typeByElement(WebElement webElement, String text) {
		webElement.sendKeys(text);
	}
	
	public static void clickByElement(WebElement webElement) {
		webElement.click();
	}
	
	public static void selectFromDropdownElement(WebElement webElement, String dropDownOption) {
		Select dropDownCountry = new Select(webElement);
		dropDownCountry.selectByVisibleText(dropDownOption);
	}
}
