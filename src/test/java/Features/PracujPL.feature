Feature: Tester job searching on pracuj.pl

  Scenario: Searching for junior tester job in Trójmiasto

    Given the user is on "https://www.google.pl" page
    When the user inputs pracuj pl into the search box
    And the user clicks on the first link that shows up
    And the user accept cookies
    Then the user inputs job name and location into the search box and then clicks search