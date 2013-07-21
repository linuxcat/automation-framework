Feature: Sunday Times top level navigation

  @sanity, @regression
  Scenario Outline: Top level navigation Items
    Given I am viewing sunday times homepage
    Then I should see a top level nav with <nav_item>
    Examples:
      |nav_item   |
      |news       |
      |sport      |
      |business   |
      |comment    |
      |news review|
      |culture    |
      |style      |
      |travel     |
      |driving    |
      |magazine   |
      |papers     |


    @manual
    Scenario: Manual Test
      Given I want to run a manual test
      When I do a manual action
      Then I expect a manual result



