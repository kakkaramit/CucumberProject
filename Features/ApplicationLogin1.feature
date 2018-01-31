#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Test Login application scenarios
  I want to use this template to login application

  # @tag1
  Scenario: Test login with invalid cerdentials
    Given Open browser Firefox and start browser
    When I enter invalid "akakkar" and invalid "t3stf1rst"
    Then On clicking 'Login' button, an error message 'Invalid Username/Password' is displayed to the user.

  # @tag2
  Scenario: Test login with valid username and invalid password
    # Given Open browser Firefox and start browser
    When I enter valid "akakkar0000" and invalid "123456"
    Then on clicking login button, an error message invalid username/password is displayed.

  # @tag3
  Scenario: Test login with valid username and invalid password
    # Given Open browser Firefox and start browser
    When I enter invalid "akakkar" and valid "t3stf1rst"
    Then on clicking login button2, an error message invalid username/password is displayed.

  # @tag4
  Scenario: Test login with valid cerdentials
    #Given Open browser Firefox and start browser
    When I enters valid "odobbs" and valid "t3stf1rst"
    Then user should be able to login successfully and Home text is displayed as a header of the page.
    And verify page title and url.
    And close driver.
