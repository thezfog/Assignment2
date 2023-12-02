Feature: Create Account

  Scenario Outline: Create Account

    Given User is on the create account page and using the browser <browser>
    And adds the date of birth <dateOfBirth>
    And adds the first name <firstName>
    And adds the last name <lastName>
    And adds the email <email>
    And confirms the email <confirmEmail>
    And adds the password <password>
    And confirms the password <confirmPassword>
    And clicks confirm terms and conditions button <terms>
    And clicks confirm age button <age>
    And clicks code of conduct button <conduct>
    When user clicks the confirm and join button
    Then a new account is made and no error message <errorMessage> is displayed

    Examples:
      | browser | dateOfBirth | firstName | lastName | email        | confirmEmail | password | confirmPassword | terms | age | conduct | errorMessage                                                              |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | matching        | yes   | yes | yes     |                                                                           |
      | chrome  | 12/06/1990  | Testare   |          | test@test.se | test@test.se | matching | matching        | yes   | yes | yes     | Last Name is required                                                     |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | notMatching     | yes   | yes | yes     | Password did not match                                                    |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | matching        | no    | yes | yes     | You must confirm that you have read and accepted our Terms and Conditions |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | matching        | yes   | yes | yes     |                                                                           |
      | edge    | 12/06/1990  | Testare   |          | test@test.se | test@test.se | matching | matching        | yes   | yes | yes     | Last Name is required                                                     |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | notMatching     | yes   | yes | yes     | Password did not match                                                    |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | matching | matching        | no    | yes | yes     | You must confirm that you have read and accepted our Terms and Conditions |
