Feature: Sunday Times Search

  Background:
    Given I am viewing sunday times homepage

    @regression, @sanity, @search
    Scenario: Search for term
      Then I can see the search box at the top right of the page
      When I type the search term "Luiz Suarez"
      And Click the search icon
      Then the search results page is displayed
      And the page returns the first 25 search results
      And has clickable pages in the pagination

