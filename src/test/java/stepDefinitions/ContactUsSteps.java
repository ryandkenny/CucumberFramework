package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;

public class ContactUsSteps {
TestContext testContext;
	
	public ContactUsSteps(TestContext context) {
		testContext = context;
	}
	
	@Given("^Fill out contact us page for customer: \"([^\\\"]*)\"$")
	public void fillOut(String customerName) {
		pages.ContactUsPage.getCustomer(customerName);
	}

}
