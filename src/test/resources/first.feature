Feature:
  Scenario: Integer is positive
    Given my integer is 9
    When integer is greater then 0
    Then integer is positive

  Scenario: Integer is negative
    Given my integer is -9
    When integer is less then 0
    Then integer is negative