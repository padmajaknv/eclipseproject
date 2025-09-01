Feature: A feature file for Background

  Background: A sample background
    Given the user opens the application
    When the user enters the credentials

  @Tag1 @Smoke @Background
  Scenario: A sample scenario
    And the user clicks on login button
    Then the user must be able to login

  @Tag2  @Sanity
  Scenario: A negative login scenario
    But the user does not click on login button
    Then the user must be able to login