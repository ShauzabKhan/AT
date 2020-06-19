Feature: Creates and submit application

  author : shauzab.khan
  @TC-02 @smoke @regression
 Scenario: Create case scenario
  Given A User logs in with "research.user14@hra.com" and "hrarules"
  And User creates a case

    And User fills out the details
    And User submits
   And fill the study info details
    And User attach document
   
#   Then Successful submission message is displayed
 #  Then User logs off from portal
 
 
 # @TC-03 @smoke @regression 
#Scenario: pickup the workitem scenario
 
#Given A User logs in with "research.user14@hra.com" and "hrarules"
#And  User click on my task 

#When User picks assignment with pyID
#Then user click on update project details
#And User fills out the details
#And User submits
#And fill the study info details
#And User attach document
 
 
 
 
 