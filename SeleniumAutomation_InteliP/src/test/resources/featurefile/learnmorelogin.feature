Feature: user validates the login functions in homepage of learn more


  #Before
  Scenario: user validates the error message in learn more sign in page
    #BeforeStep
    #Given user navigates to learn more login page
    #AfterStep   (This @BeforeStep & @AfterStep (Hooks Annotation) is used in Hooks to take screenshot before each and every test step)

    #BeforeStep
    When user enter username "xyz" and password "123"
    #AfterStep

    #BeforeStep
    And user clicks on login button
    #AfterStep

    #BeforeStep
    Then user validate the error message
    #AfterStep

    #After

    # Before
  Scenario: login page title validation
      #Given user navigates to learn more login page
    Then user validate the title of login page
      #After

  Scenario: learn more login validation
        #Given user navigates to learn more login page
    When user enter username "LearnMore" and password "learnmore@123"
    And user clicks on login button
    Then user validate the whether navigates to home page


  Scenario Outline: multiple login validations
          #Given user navigates to learn more login page
    When user enter username "<UserName>" and password "<Password>"
    And user clicks on login button
    Then user validate the error message
    Examples:
      | UserName  | Password |
      | Learnmore | 123      |
      | Guru      | abc      |
      | Apple     | 12345    |



