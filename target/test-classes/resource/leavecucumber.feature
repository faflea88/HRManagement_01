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
       Scenario: as a user I would like to create leave plan
       Given I click Leave menu
       When I click From date 
       And I Click To date
       Then click show leave with status 
       And selected employee
       And selected sub unit
       And selected include past employess
        And click search 
       
       
       