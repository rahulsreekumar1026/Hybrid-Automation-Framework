@login
Feature: Login scenarios

  Background:
    Given user closes cookie popup

  @mobile @web @regression @test
  Scenario:Verify login to app
    Given user enters user name as "Admin"
    And user enters password as "admin123"
    When user clicks on login button

  @mobile @web @regression @smoke @final @test
  Scenario:Verify login to app and validate user lands on home screen
    Given user enters user name as "Admin"
    And user enters password as "string"
    When user clicks on login button
    Then user is on "Home" screen


