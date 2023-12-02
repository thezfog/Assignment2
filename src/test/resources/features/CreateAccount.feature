Feature: Create Account

  Scenario Outline: Create Account

    Given User is on the create account page and using the browser <browser>
    And add the date of birth <dateOfBirth>
    And add the first name <firstName>
    And add the last name <lastName>
    And add the email <email>
    And confirm the email <confirmEmail>
    And add the password <password>
    And confirm the password <confirmPassword>
    And click confirm terms and conditions button <terms>
    And click confirm my age button <age>
    And click code of conduct button <conduct>
    When user click the confirm and join button
    Then no error message <errorMessage> is displayed

    Examples:
      | browser | dateOfBirth | firstName | lastName | email        | confirmEmail | password | confirmPassword | terms | age | conduct | errorMessage                                                              |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej123          | yes   | yes | yes     |                                                                           |
      | chrome  | 12/06/1990  | Testare   |          | test@test.se | test@test.se | hej123   | hej123          | yes   | yes | yes     | Last Name is required                                                     |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej126          | yes   | yes | yes     |                                                                           |
      | chrome  | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej123          | no    | yes | yes     | You must confirm that you have read and accepted our Terms and Conditions |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej123          | yes   | yes | yes     |                                                                           |
      | edge    | 12/06/1990  | Testare   |          | test@test.se | test@test.se | hej123   | hej123          | yes   | yes | yes     | Last Name is required                                                     |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej126          | yes   | yes | yes     |                                                                           |
      | edge    | 12/06/1990  | Testare   | Testsson | test@test.se | test@test.se | hej123   | hej123          | no    | yes | yes     | You must confirm that you have read and accepted our Terms and Conditions |
