Feature: to test a get API
  Background:
    * header Accept = 'application/json'
    * url someUrlBase
  @Value
  #Testing the post function
  Scenario: Testing the get API
    Given path '/POST'
    And param Coupon = 0.05
    And request { Price: 5000, Face: 5 }
    When method post
    Then status 200
    And match response == {"Price": 5000, "Face": 5, "Result": 23750.0}
