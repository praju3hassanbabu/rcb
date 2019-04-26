Feature: Login features
@valid
Scenario Outline:: Valid User Scenario
    Given The URL of Test Me APP
    When user enter <username> as userName
    And user enters <password> asn password
    Then user is in <page>
 Examples:
 |username  |password		|page   		|
 |Lalitha	|Password123	|Home			|
 |admin		|Password456	|Admin Home 	| 
 @invlaid
 Scenario: Invalid scenario
 		Given The url of test me app
 		When user enters invalid data
 		|accc	|Password123	|
 		|Lalitha|adfasd			|
 		|afdfas	|afd			|
 		Then user is in login page
 		|afad|
 		|gg|
 		|GGG|
 		
#Scenario: Valid Admin Scenario
#    Given The URL of Test Me APP
#    When user enter "admin" as userName
 #   And user enters "Password456" asn password
 #   Then user is in home page