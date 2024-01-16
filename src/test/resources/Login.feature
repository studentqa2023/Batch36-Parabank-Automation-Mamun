@smoke
Feature: parabank login testing
Description: User should already have an account
Background:
@TC1 
Scenario Outline: As a user , i want to login to parabank website using valid credential
Given open the browser
And pass the URL "<URL>"
When enter username "<username>" in the username field
And enter password "<password>" in the password field
And click on login
Then validate login is successful
Examples: 
|URL                                                           |username|password|
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC|mamun2023|smarttech24|

