@duckduckgo @all
Feature: Duckduckgo automated test
Description: Testing the cucumber selenium framework.

Scenario: Navigating to duck duck go and search for the gov.uk website
	Given I navigate to hardcoded url
	When I enter "HM Revenue & Customs - GOV.UK" in the "search_form_input_homepage" field
	And I press "search_button_homepage" button
	Then I select the "HM Revenue & Customs - GOV.UK" link
