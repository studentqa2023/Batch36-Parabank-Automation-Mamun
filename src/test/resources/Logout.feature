@smoke
Feature: parabank logout testing
Description: User should already have an account
Background: user should be logged in
@TC1 
Scenario Outline: As a logged in user, i want to logout successfully from thr parabank website
Given open the browser
And pass the URL "<URL>"
When enter username "<username>" in the username field
And enter password "<password>" in the password field
And click on login
And click on log out
Then validate logout is successful
Examples: 
|URL                                                           |username|password|
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC|mamun2023|smarttech24|

