Feature: User opens assignment

  #author : shauzab.khan
  @TC-02 @smoke
  Scenario: Open assignment scenario
    Given A User logs in with "research.user1" and "hrarules"
    Then User opens an assignment
    Then User logs off from portal
