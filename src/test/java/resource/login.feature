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
       Scenario: as a user I would to access the admin page and add new user
       Given I click admin menu
       When I click Add button 
       And I enter the value
       Then click save button 
       
       
   
       