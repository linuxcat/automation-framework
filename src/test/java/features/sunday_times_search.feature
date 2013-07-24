Feature: Sunday Times Search

  As a User on the Sunday Times Site
  I want to Search the Sunday Times Site
  So That I can find articles that I am interested in

  Background:
    Given I am viewing sunday times homepage
    Then I can see the search box at the top right of the page


  @regression @search
    Scenario: Search for articles using a search term
      When I type the search term "Luiz Suarez"
      And Click the search icon
      Then the search results page is displayed
      And the page returns the first 25 search results

  @regression @search
  Scenario: Sunday times pop out suggestions
    When I type the search term "sport"
    Then Sunday Times suggestions overlay is displayed
    And has 8 suggestions



