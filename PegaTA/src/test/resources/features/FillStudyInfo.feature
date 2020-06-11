Feature: Update the study info

  @TC-03 @smoke 
  Scenario: Login in scenario
    Given A User logs in with "research.user1" and "hrarules"
    Then fill the study info details
    Then User logs off from portal
    