@Test @REG
Feature: User is register successfully
  Scenario: User should be able to register successfully
    Given User is on Home
    When User click on My Account and Register Button
    And User enter all required registration detail
    Then User should be able to register successfully