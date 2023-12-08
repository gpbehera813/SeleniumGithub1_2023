Feature: user book a ticket in cleartrip webpage

  @CLEARTRIPTICKET
  Scenario: user book a flight ticket
    Given user select the oneway trip type in cleartrip
    When user select number of person and class type
    And user select the type of discount in cleartrip
    And user select the boarding city and user select the destination city in clear trip
    And user select the travelling date and return date in cleartrip
    Then user click on search button and look for available flights in cleartrip