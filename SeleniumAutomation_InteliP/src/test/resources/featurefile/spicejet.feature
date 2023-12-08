Feature: Functionality of spicejet

  @SC03
  Scenario: user handles the currency dropdown in spicejet home page
  //Given user navigate to spicejet
    Given user selects the value from currency dropdown

  @SC02
  Scenario: user validates the checkbox and radio button in spicejet home page
      #Given user navigate to spicejet (as it is declared Globally)
    Given user selects the checkbox and radio button

  @SC02
  Scenario: user validates the dynamic dropdown in spicejet home page
    Given user selects the dropdown value in From and To in dynamic dropdown

