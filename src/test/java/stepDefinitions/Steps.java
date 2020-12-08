package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Steps {
TestContext testContext;

	public Steps(TestContext context) {
		testContext = context;
	}
	
	@Given("^I navigate to \"([^\"]*)\"$")
	public void navigateTo(String page) {
		pages.BasePage.getUrl(page);
	}

	@When("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
	public void searchFor(String text, String id) {
		pages.BasePage.enterTextById(text, id);
	}
	
	@When("^I press \"([^\"]*)\" button$")
	public void pressButton(String buttonId) {
		pages.BasePage.clickById(buttonId);
	}
	@Then("^I select the \"([^\"]*)\" link$")
	public void selectFromResults(String link) {
		pages.BasePage.clickByLinkText(link);
	}
	@Then("^The header is \"([^\"]*)\"$")
	public void checkPageHeader(String pageHeader) {
		pages.BasePage.checkHeader(pageHeader);
	}
	
	@Then("^The 2nd header is \"([^\"]*)\"$")
	public void checkPageHeader2(String pageHeader) {
		pages.BasePage.checkHeader2(pageHeader);
	}
	
	@Then("^The url is \"([^\"]*)\"$")
	public void checkPageUrl(String url) {
		pages.BasePage.checkUrl(url);
	}
}
