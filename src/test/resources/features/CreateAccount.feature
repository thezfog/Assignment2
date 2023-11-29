Feature: Create Account

  Scenario Outline: Create Valid Account

    Given I add the date of birth <dateOfBirth>
    And enter the valid first name <firstName>
    And enter the valid last name <lastName>
    And enter the valid email <email>
    And confirm my valid email <email>
    And enter the valid password <password>
    And confirm my valid password <password>
    And click confirm terms and conditions button
    And click confirm my age button
    And click code of conduct button
    When I click the confirm and join button
    Then the button is active

    Examples:
      | dateOfBirth | firstName | lastName | email               | password |
      | 12/06/1990  | Testare   | Testssin | thezan_@hotmail.com | hej123   |


  Scenario Outline: Create Account Without Last Name

    Given I add the date of birth <dateOfBirth>
    And enter the valid first name <firstName>
    And enter the valid email <email>
    And confirm my valid email <email>
    And enter the valid password <password>
    And confirm my valid password <password>
    And click confirm terms and conditions button
    And click confirm my age button
    And click code of conduct button
    When I click the confirm and join button
    Then the button is inactive

    Examples:
      | dateOfBirth | firstName | lastName | email               | password |
      | 12/06/1990  | Testare   | Testssin | thezan_@hotmail.com | hej123   |

