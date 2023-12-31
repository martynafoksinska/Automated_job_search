Feature: Search functionality for justjoinit.pl page

  Scenario: Searching for junior tester job in Trójmiasto

    Given user is on "https://www.google.pl" page
    When user inputs just join it into the search box
    And user clicks on the first link that shows up
    And user clicks on the testing category
    And user clicks on more filters and chooses permanent, junior and then clicks show offers
    And user clicks location and chooses Trójmiasto
    Then screenshot with available job offers is taken