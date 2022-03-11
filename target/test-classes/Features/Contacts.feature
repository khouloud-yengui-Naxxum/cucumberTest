Feature: contact page feature
Scenario: make sure that the email field is visible

   Given when user open the website and go to login page 
    When user fill email as "yosraa" and password as "test123"  and click login
    And click on contact button
    Then email test field should be visible
    Then browser should be closed
     
Scenario: Add new contacts
    
      Given when user open the website and go to login page 
      When user fill email as "yosraa" and password as "test123"  and click login
      And click on contact button
      And click on new contact button
      And fill the firstname and lastname 
      Then new contacts shloud be added
      Then browser should be closed