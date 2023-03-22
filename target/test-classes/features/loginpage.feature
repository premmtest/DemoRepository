Feature: Facebook page validation

#Background:
#Given User is on facebook page


Scenario Outline: Login page with invalid Credentials

Given User is on facebook page
When User enter the "<username>" and "<password>"
And User clicks on loginpage
Then User verify the error message

Examples:
|username|password|
|Hello|12345|
|prem|12345|

#@smoke
#Scenario:Fb page title validation

#When User print the pagetitle


#@sanity
#Scenario:Fb current Url 

#When User get current url
