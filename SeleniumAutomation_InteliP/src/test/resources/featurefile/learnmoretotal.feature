Feature: learmore all functions validations

  @SC01
  Scenario: user validates the checkbox in learnmore homepage
    Given user select the checkbox option
    When user validate the checkbox


  @SC01
  Scenario: user validates the radio button in learnmore homepage
    Given user select the radio button option
    When user validate the radio button


  @SC01
  Scenario: user validate the right click operation in learnmore home page
    Given user select the action class option
    When user perform the right click operation
    Then user validate the right click operation


  @SC01
  Scenario: user validate the double click operation in learnmore home page
    Given user select the action class option
    When user perform the double click operation
    Then user validate the double click operation



  @SC01
  Scenario: user validate the drag and drop in learnmore home page
    Given user select the action class option
    When user perform the drag and drop
    Then user validate the drag and drop action
