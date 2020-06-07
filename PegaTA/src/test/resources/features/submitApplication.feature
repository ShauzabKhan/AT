Feature: Creates and submit application

  #author : shauzab.khan
  @TC-02 @smoke @regression
  Scenario: Create case scenario
    Given A User logs in with "research.user1" and "hrarules"
    And User opens an assignment
    And User fills out the details
    And User submits
    Then Successful submission message is displayed
    Then User logs off from portal
