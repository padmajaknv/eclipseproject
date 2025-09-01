@FeatureTag
Feature: A sample feature file

  @Tag1 @Smoke
  Scenario: A sample scenario
    Given the user opens the application
    When the user enters the credentials
    And the user clicks on login button
    Then the user must be able to login

   @Tag2  @Sanity
  Scenario: A negative login scenario
    Given the user opens the application
    When the user enters the credentials
    But the user does not click on login button
    Then the user must be able to login

     @Params
  Scenario: A sample parameter scenario
    Given the user opens the application
    When the user enters username as "QT930AMJuly2025"
    When the user enters password as "0123456789"
    And the user clicks on login button
#    And user enters helloworld@gmail.com as email
    Then the user will see the score as 565 for 600