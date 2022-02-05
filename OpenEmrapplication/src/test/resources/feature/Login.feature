Feature: Login
  	In order to maintain the medical records
  	As a user
  	I would like access the OpenEMR portal

  Scenario: Invalid Credential
    Given I have browser with OpenEMR page
    When I enter username as 'admi'
    And I enter password as 'pas'
    And I select language as 'English (Indian)'
    And I click on login
    Then I should get the error 'Invalid username or password'

  Scenario Outline: Valid Credential
    Given I have browser with OpenEMR page
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I select language as '<language>'
    And I click on login
    Then I should get access to portal with title as 'OpenEMR'

    Examples: 
      | username  | password  | language         |
      | admin     | pass      | English (Indian) |
      | physician | physician | English (Indian) |
