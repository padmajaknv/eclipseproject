Feature: A feature file for Scenario Outline

  Scenario Outline: A sample scenario outline
    Given the user opens the application
    And the user enters username as "<username>"
    And the user enters password as "<password>"
    When the user clicks on login button
    Then the user must be able to login

    @ExamplesTag
    Examples:
      | username | password |
      | ABCD     | 0123     |
      | BCDE     | 1234     |
      | CDEF     | 2345     |