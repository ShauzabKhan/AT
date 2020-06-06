Feature: User log in

  #author : shauzab.khan
  @TC-01 @smoke
  Scenario: Login in scenario
    Given A User logs in with "research.user1" and "hrarules"
    Then User logs off from portal
    
