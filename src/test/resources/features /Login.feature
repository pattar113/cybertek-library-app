Feature: LoginAs I user, I should be able to login
  @loginAsLibrarian
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

    @loginAsStudent
  Scenario: Login as a student
    Given I am on the login page
    When I login as a student
    Then dashboard should be displayed