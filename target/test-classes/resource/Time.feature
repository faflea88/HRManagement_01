Feature: Login to HRM Application 
  @ValidCredentials
   Scenario Outline:: Login with valid credentials
      
    Given User is on Home page
    When user enters Email as "<email>" and Password as "<password>"
    And I click login button
    Then User should be able to login successfully
     Examples:
       |email|password|
       |Admin|admin123|
 
     
     @ValidCredentials
       Scenario: as a user I would like to edit the time
       Given I click time menu
       When I click click view button
       And I Click edit button
       Then I update some data
      
       
      
       