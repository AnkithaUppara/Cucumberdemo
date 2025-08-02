Feature: Login

Scenario: To verify login by entering invalid credentials

Given  User is on login page
When User enters invalid username and invalid password
And User clicks on login button
Then an error message should be displayed

