Feature: Submit an assignment
  Assignment should not be submitted without attaching any file or artifact
  Assignment should not be submitted until submit button is clicked.
  If user has attached a file or an artifact then on clicking submit button assigment should be submitted.

  # @tag1
  Scenario: Check wheather assignment is displayed under 'Assigments' sidemenu.
    Given Open browser and login to the application.
    When User clicks 'Courses' sidemenu
    Then Application navigates to Courses > My Courses sie menu
    When User clicks 'Coursework' sidemenu.
    Then Application navigates to 'Assignments' side menu
    And Assignment is displayed on the page and name of assignment is in link form

  # @tag2
  Scenario: Check whether user has attached an artifact within assignment
    Given I am on assignment side menu
    When I clicked on name of an assignment
    Then application navigates and displayed assignment details page
    When I clicked select button corresponing to an artifact
    Then An artifact form is displayed in editable mode

  # @tag3
  Scenario: Enter data in the form and save it
    Given I am on the Form page
    When I selected date for 'Date' type entry
    And I input value for 'Decimal' type entry
    And I upload file for 'File' type entry
    And I select radio button for 'Likert' type entry
    And I select value from 'Dropdown' type entry
    And I select radio dutton for 'Radio' type entry
    And i select check box for 'Checkbox' type entry
    And I select first radio button for 'Rubric' type entry
    And I select second radio button for 'Rubric' type entry
    And I input text in 'Single Line Text' tupe entry
    And I press "Add" button
    Then I should see 'Form saved' and application navigates to Assignment details page.
    Then I submiited the assignment
    And select yes for the submission alert message
    
    # @tag4
    Scenario: Recall assignment
    Given: Assignment is already submitted
    When I selected checkbox corresponding to an assignment
    And click 'Recall' button
    Then An assignment is recalled and pending flag is displayed corresponing to an assignment.
    And Close the brwser.
    
    