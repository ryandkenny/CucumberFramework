@formTest @all
Feature: Selenium easy form test
Description: Testing the cucumber selenium framework for form input.

Scenario: Navigating to selenium easy and testing form input page
	Given I navigate to "seleniumEasy"
	Then The 2nd header is "Input form with validations"
	And The url is "https://www.seleniumeasy.com/test/input-form-demo.html"
	Then Fill out contact us page for customer: "Test"
	
