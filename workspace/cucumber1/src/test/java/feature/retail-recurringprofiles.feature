Feature: Retail site - Recurring Profiles section

  Background: background case
    Given user is on login page
    When user enter valid username and password
    And user click on submit button
    Then user enters into home page
    When user click the left menu bar
    And user click the category section
    And user click on the recurring profiles section
    Then user enters the recurring profile page
  
  @adding_profiles_test
  Scenario: Add recurring profile
    
    When user click the add recuuring profile section
    And user fillup the details in add recurring profiles section
    And user click on the save button
    Then the details are now saved and the profile is added
 
  @editing_profiles_test
  Scenario: Edit recurring profile
    
    When user select a profile to edit
    And user edits the details
    Then the profile details are now edited

  @deleting_profile_test
  Scenario: Delete recurring profile
   
    When user select a profile to delete
    And user click the delete button
    And accept the delete alert
    Then the profile is now deleted
    
    
  @copy_profile_test  
  Scenario: copy recurring profile
    
    When user select a profile to copy
    And user click the copy button
    Then the profile is now copied
  


  