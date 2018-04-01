@ee
Feature: Contact Search

Scenario: Contact Search with data from excel sheet
Given I logged into suiteCRM
And I validate contacts with data in excel sheet "Workbook6.xlsx" and "Sheet2"
#Then LogOut