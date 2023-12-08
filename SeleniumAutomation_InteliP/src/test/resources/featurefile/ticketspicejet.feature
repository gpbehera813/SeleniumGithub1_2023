Feature: user book a flight ticket in spicejet webpage

  @SPICEJETTICKET
  Scenario: user book ticket in flight
    Given user select the oneway trip type
    When user select the boarding city and user select the destination city
    And user select the travelling date and return date
    And user select the type of personnel
    And user select the number of passenger
    And user select the currency type
    Then user click on search button and look for available flights

