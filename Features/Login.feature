#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login
  Check login feature


  #Scenario: successfull login
   # Given user is on home page
   # When navigate to login page
  #  And enter username and password and click login button
  #  Then user will navigate to account page
@loginTest
Scenario Outline: successfull login
Given user is on home page and have testdata as "<id>"
When navigate to login page
And enter username and password and click login button
Then user will navigate to account page
   
Examples:
 |id|
 |01|

 @loginTest1
Scenario Outline: successfull login 2
Given user is on home page and have testdata as "<id>"
When navigate to login page
And enter username and password and click login button
Then user will navigate to account page
   
Examples:
 |id|
 |01|
 |02|