Feature: Clients

  Scenario: Successful diligence of client
    Given I have access to EasyManagment page
    When I select principal menu
    And I access to Clients menu
    And I diligence client name
    And I diligence client identification
    And I diligence client phone
    And I diligence client birthday name
    And I diligence client surname
    And I diligence client email
    And I diligence client address
    And I select male client genre
    And I click Save
    Then It shows a message with Alert and message Hello World