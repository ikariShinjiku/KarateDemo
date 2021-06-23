Feature: to test a get API
  Background:
    * header Accept = 'application/json'
    * url someUrlBase
  @Value
  #Testing the get function
  Scenario: Testing the get API
    And path '/GET'
    And param Price = 5000
    And param Coupon = 5
    When method get
    Then status 200
    And match response.Coupon == 0.005
