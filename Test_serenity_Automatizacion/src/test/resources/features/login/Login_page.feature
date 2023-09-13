Feature: Login Home page
  @test
  Scenario: login succesful
    Given I othen home page
    When I type the user and password
    Then I can see the home init page


  Scenario: Failed login
    Given I am on the home page
    When I enter the correct username but an incorrect password
    Then I should see an error message indicating the login has failed