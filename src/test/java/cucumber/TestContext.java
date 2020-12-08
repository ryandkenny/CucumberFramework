package cucumber;
 
import managers.WebDriverManager;
import pages.BasePage;
import pages.ContactUsPage;
 
public class TestContext {
 private WebDriverManager webDriverManager;
 private BasePage basePage;
 private ContactUsPage contactUsPage;
 
 public TestContext(){
 webDriverManager = new WebDriverManager();
 basePage = new BasePage(webDriverManager.getDriver());
 contactUsPage = new ContactUsPage(webDriverManager.getDriver());

 }
 
 public WebDriverManager getWebDriverManager() {
 return webDriverManager;
 }
 
 public BasePage getBasePage() {
	 return basePage;
	 }
 
 public ContactUsPage contactUsPage() {
	 return contactUsPage;
 }
}
