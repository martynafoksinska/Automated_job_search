Feature: Tester job searching on pracuj.pl

  Scenario: Searching for junior tester job in Trójmiasto

    Given the user is on "https://www.google.pl" page
    When the user inputs pracuj pl into the search box
    And the user clicks on the first link that shows up
    And the user accept cookies
#    And user clicks on more filters and chooses permanent, junior and then clicks show offers
#    Then user clicks location and chooses Trójmiasto