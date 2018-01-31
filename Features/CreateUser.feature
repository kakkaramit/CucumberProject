Feature: Test create user scenario

  Scenario: Create new user by inputing data
    Given User already logged in to the application
    When User clicks 'Administration' sidemenu
    Then Application navigate to 'Create User' side menu and validate header text.
    When I clicked 'Create New User' button
    And selected a role from the 'Role' drop down
    Then I clicked 'Next' button
    When I input details within input field of create user and click update button
      | pid   | fname | lname  | email    |
      | CM018 | John  | Sharma | js1@tk.co |
      | CM019 | June  | Verma  | jv1@tk.co |
		Then All the users should be created and verified