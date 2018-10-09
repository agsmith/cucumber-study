Feature: Character
  Optional description of the feature

  Scenario: This character is Mario
    Given I have a character
    When The character has a mustache
    And The character has a red hat
    Then The character is Mario

  Scenario: This character is Luigi
    Given I have a character
    When The character has a mustache
    And The character has a green hat
    Then The character is Luigi

  Scenario: This character is Peach
    Given I have a character
    When The character does not have a mustache
    Then The character is Peach