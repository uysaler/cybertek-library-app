Feature: Login with parameters

  @librarianParam
  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian12@library"
    And I enter password 'AOYKYTMJ'
    And click the sign in button
    And there should be 2841 users
    Then dashboard should be displayed
#number can be whatever you have there
  @studentParam
  Scenario: Login as student 30
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password 'IaT9YI0I'
    And click the sign in button
    Then books should be displayed
#number can be whatever you have there

  @wip
  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "AOYKYTMJ"
    Then dashboard should be displayed

#number can be whatever you have there