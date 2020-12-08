package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import testData.Customer;
 
public class ContactUsPage {
	static WebDriver driver;
	
	
	public ContactUsPage(WebDriver driver) {
		ContactUsPage.driver = driver;
	    PageFactory.initElements(driver, this);

	}
	
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(2) > div > div > input") 
	 private static WebElement contactUs_FirstName;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(3) > div > div > input") 
	 private static WebElement contactUs_LastName;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(4) > div > div > input") 
	 private static WebElement contactUs_Email;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(5) > div > div > input") 
	 private static WebElement contactUs_Phone;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(6) > div > div > input") 
	 private static WebElement contactUs_Address;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(7) > div > div > input") 
	 private static WebElement contactUs_City;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(8) > div > div > select") 
	 private static WebElement contactUs_State;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(9) > div > div > input") 
	 private static WebElement contactUs_ZipCode;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(10) > div > div > input") 
	 private static WebElement contactUs_Website;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(11) > div > div:nth-child(1) > label") 
	 private static WebElement contactUs_HostingYes;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(11) > div > div:nth-child(2) > label") 
	 private static WebElement contactUs_HostingNo;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(12) > div > div > textarea") 
	 private static WebElement contactUs_Description;
	 
	 @FindBy(how = How.CSS, using = "#contact_form > fieldset > div:nth-child(14) > div > button") 
	 private static WebElement contactUs_Button;
	 
	 public static void getCustomer(String customerName) {
		 Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);

		 fillCustomerDetails(customer);	
	 }
	 
	 public static void fillCustomerDetails(Customer customer) {
		 BasePage.typeByElement(contactUs_FirstName, customer.firstName);
		 BasePage.typeByElement(contactUs_LastName, customer.lastName);
		 BasePage.typeByElement(contactUs_Email, customer.emailAddress);
		 BasePage.typeByElement(contactUs_Phone, customer.phoneNumber);
		 BasePage.typeByElement(contactUs_Address, customer.address);
		 BasePage.typeByElement(contactUs_City, customer.city);
		 BasePage.selectFromDropdownElement(contactUs_State, customer.state);
		 BasePage.typeByElement(contactUs_ZipCode, customer.state);
		 BasePage.typeByElement(contactUs_Website, customer.website);
		 BasePage.radioButtonByElement(contactUs_HostingYes, contactUs_HostingNo, customer.hosting);
		 BasePage.typeByElement(contactUs_Description, customer.description);
		 BasePage.clickByElement(contactUs_Button);


	 }
	
	
	
	
	
	
}
