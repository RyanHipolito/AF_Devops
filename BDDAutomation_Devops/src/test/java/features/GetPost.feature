Feature: Check status code of API

Scenario: Verify post author
Given User performs GET operation for "/posts"
Then User should see status code as 200

#Scenario: Verify collection of authors in post
#Given User performs GET operation for "/posts"
#Then User should see author names
#
#Scenario: Verify path parameter of GET
#Given User performs GET operation for "/posts"
#Then User should verify GET parameters
#
#Scenario: Verify path parameter of GET
#Given User performs GET operation for "/posts"
#Then User should verify GET query parameters